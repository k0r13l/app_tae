package com.mtz.tae.ui.mapasitio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.mtz.tae.R;
import com.mtz.tae.databinding.FragmentMapasitioBinding;

import com.mtz.tae.ui.blank.BlankFragment;
import com.mtz.tae.ui.destinos.DestinosFragment;
import com.mtz.tae.ui.home.HomeFragment;
import com.mtz.tae.ui.recomendaciones.RecomendacionesFragment;
import com.mtz.tae.ui.sobrenosotros.SobreNosotrosFragment;

public class MapaSitioFragment extends Fragment {

    private FragmentMapasitioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MapaSitioViewModel homeViewModel =
                new ViewModelProvider(this).get(MapaSitioViewModel.class);

        binding = FragmentMapasitioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        accionBotones();
        return root;
    }

    private void accionBotones() {
        Button irHome = this.binding.btncvIrHome;
        irHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new HomeFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.viewMapaSitio, fragment, null);
                //fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        /**************************************************************************************/
        Button irDestinos = this.binding.btncvIrDestinos;
        irDestinos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new DestinosFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.viewMapaSitio, fragment, null);
                //fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        /**************************************************************************************/
        Button irRecomendaciones = this.binding.btncvIrRecomendaciones;
        irRecomendaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.cdvHome.setVisibility(View.INVISIBLE);
                binding.cdvmapasitio.setVisibility(View.INVISIBLE);
                binding.cdvDestinos.setVisibility(View.INVISIBLE);
                binding.cdvRecomendaciones.setVisibility(View.INVISIBLE);
                binding.cdvSobrenosotros.setVisibility(View.INVISIBLE);

                Fragment fragment = new RecomendacionesFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.viewMapaSitio, fragment, null);
                //fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        /**************************************************************************************/
        Button irMapaS = this.binding.btncvIrmapasitio;
        irMapaS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new MapaSitioFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.viewMapaSitio, fragment, null);
                //fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        /**************************************************************************************/
        Button irSobreNosotros = this.binding.btncvIrSobrenosotros;
        irSobreNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.cdvHome.setVisibility(View.INVISIBLE);
                binding.cdvmapasitio.setVisibility(View.INVISIBLE);
                binding.cdvDestinos.setVisibility(View.INVISIBLE);
                binding.cdvRecomendaciones.setVisibility(View.INVISIBLE);
                binding.cdvSobrenosotros.setVisibility(View.INVISIBLE);

                Fragment fragment = new SobreNosotrosFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.viewMapaSitio, fragment, null);
                //fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}