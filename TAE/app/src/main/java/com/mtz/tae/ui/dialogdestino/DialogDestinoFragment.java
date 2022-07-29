package com.mtz.tae.ui.dialogdestino;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.mtz.tae.databinding.FragmentDialogdestinoBinding;

import com.mtz.tae.R;

public class DialogDestinoFragment extends DialogFragment implements OnMapReadyCallback {

    private FragmentDialogdestinoBinding binding;

    private String nombre;
    private String descripcion;
    private String provincia;
    private String precio;
    private String capacidad;
    private String facilidades;
    private int img;

    private double latitud;
    private double longitud;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DialogViewModel homeViewModel =
                new ViewModelProvider(this).get(DialogViewModel.class);

        binding = FragmentDialogdestinoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        this.binding.mapViewD.onCreate(savedInstanceState);
        this.binding.mapViewD.getMapAsync(this);

        setValues();
        return root;
    }

    private void setValues() {
        this.binding.tvNombreDialog.setText(this.nombre);
        this.binding.etmDescripcionDialog.setText(this.descripcion);
        this.binding.tvProvinciaDialog.setText(this.provincia);
        this.binding.tvPrecioDialog.setText(this.precio);
        this.binding.tvCapacidadDialog.setText(this.capacidad);
        this.binding.tvFailidadDialog.setText(this.facilidades);
        this.binding.imgvImagenDialog.setImageResource(this.img);



        this.img = 0;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setFacilidades(String facilidades) {
        this.facilidades = facilidades;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap map) {
        map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new
                LatLng(this.latitud, this.longitud), 15));

        //add this code...
        map.addMarker(new MarkerOptions().position(new LatLng(this.latitud, this.longitud)).title(this.nombre));
        if (ActivityCompat.checkSelfPermission(getActivity().getApplicationContext()
                , Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity().getApplicationContext()
                , Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        map.setMyLocationEnabled(true);
        map.getUiSettings().setMyLocationButtonEnabled(true);

    }

}