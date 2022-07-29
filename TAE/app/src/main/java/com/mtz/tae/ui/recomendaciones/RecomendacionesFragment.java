package com.mtz.tae.ui.recomendaciones;

import android.app.backup.BackupDataInput;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mtz.tae.R;

import com.mtz.tae.adapter.ListaDestinosAdapter;
import com.mtz.tae.databinding.FragmentRecomendacionesBinding;
import com.mtz.tae.model.Destino;
import com.mtz.tae.model.RegistroUsuario;
import com.mtz.tae.utility.DestinosSingleton;
import com.mtz.tae.utility.Euclides;

import java.util.List;

public class RecomendacionesFragment extends Fragment {

    private FragmentRecomendacionesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RecomendacionesViewModel homeViewModel =
                new ViewModelProvider(this).get(RecomendacionesViewModel.class);

        this.binding = FragmentRecomendacionesBinding.inflate(inflater, container, false);
        View root = this.binding.getRoot();

        setDesplegables();
        accionBuscarR();

        return root;
    }

    private void accionBuscarR() {
        Button btnBuscarR = this.binding.btnBuscarR;
        btnBuscarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ubicacion = binding.spinnerUbicaciones.getSelectedItem().toString();
                String classEdad = binding.spinnerClassEdad.getSelectedItem().toString();
                String rangoPrecios = binding.spinnerPrecios.getSelectedItem().toString();
                String capacidad = binding.spinnerCapacidad.getSelectedItem().toString();
                String facilidad = binding.spinnerFacilidades.getSelectedItem().toString();
                String actividadP = binding.spinnerActividadPrincipal.getSelectedItem().toString();

                String dataUsuario[] = {
                        ubicacion,
                        classEdad,
                        rangoPrecios,
                        capacidad,
                        facilidad,
                        actividadP};

                RegistroUsuario registroUsuario = new RegistroUsuario(dataUsuario);
                Euclides euclides = new Euclides(DestinosSingleton.getInstance().listaDestinos,
                        registroUsuario);
                System.out.println("***************************************************");
                for (Destino item:
                     DestinosSingleton.getInstance().listaDestinos) {
                    System.err.println(item.toString());
                    System.out.println(" ");
                }
                System.out.println("***************************************************");
                List<Destino> destinosRecomendados = euclides.obtenerDestinos();

                Toast.makeText(getContext(),
                        euclides.getClase(),
                        Toast.LENGTH_SHORT).show();

                RecyclerView rRecomendados = binding.recyclerRecomendados;

                ListaDestinosAdapter adapter = new ListaDestinosAdapter(destinosRecomendados, RecomendacionesFragment.this);

                rRecomendados.setLayoutManager(new LinearLayoutManager(getContext()));
                rRecomendados.setAdapter(adapter);

            }
        });
    }

    private void setDesplegables() {
        Spinner spUbicaciones = this.binding.spinnerUbicaciones;

        ArrayAdapter<CharSequence> adapterUbicaciones = ArrayAdapter.createFromResource(getContext(),
                R.array.ubicacionesR, android.R.layout.simple_spinner_item);
        spUbicaciones.setAdapter(adapterUbicaciones);
        /******************************************************************************************/
        Spinner spClassEdad = this.binding.spinnerClassEdad;

        ArrayAdapter<CharSequence> adapterClassEdad = ArrayAdapter.createFromResource(getContext(),
                R.array.classEdadR, android.R.layout.simple_spinner_item);
        spClassEdad.setAdapter(adapterClassEdad);
        /******************************************************************************************/
        Spinner spRangoPrecios = this.binding.spinnerPrecios;

        ArrayAdapter<CharSequence> adapterPrecios = ArrayAdapter.createFromResource(getContext(),
                R.array.rangoDePreciosR, android.R.layout.simple_spinner_item);
        spRangoPrecios.setAdapter(adapterPrecios);
        /******************************************************************************************/
        Spinner spCapacidad = this.binding.spinnerCapacidad;

        ArrayAdapter<CharSequence> adapterCapacidad = ArrayAdapter.createFromResource(getContext(),
                R.array.capacidadR, android.R.layout.simple_spinner_item);
        spCapacidad.setAdapter(adapterCapacidad);
        /******************************************************************************************/
        Spinner spFacilidades = this.binding.spinnerFacilidades;

        ArrayAdapter<CharSequence> adapterFacilidades = ArrayAdapter.createFromResource(getContext(),
                R.array.facilidadR, android.R.layout.simple_spinner_item);
        spFacilidades.setAdapter(adapterFacilidades);
        /******************************************************************************************/
        Spinner spActividadPrincipal = this.binding.spinnerActividadPrincipal;

        ArrayAdapter<CharSequence> adapterActividadP = ArrayAdapter.createFromResource(getContext(),
                R.array.actividadPrincipalR, android.R.layout.simple_spinner_item);
        spActividadPrincipal.setAdapter(adapterActividadP);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}