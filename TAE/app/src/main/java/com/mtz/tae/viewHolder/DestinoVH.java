package com.mtz.tae.viewHolder;

import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mtz.tae.R;

import org.jetbrains.annotations.NotNull;

public class DestinoVH extends RecyclerView.ViewHolder{

    public ImageView imagenDestino;

    public Button botonVerMas;

    public TextView nombre;
    public TextView descripcion;
    public TextView provincia;
    public TextView precio;
    public TextView facilidad;
    public TextView capaciadad;

    public int imgRId;

    public DestinoVH(@NonNull @NotNull View itemView) {
        super(itemView);
        this.imagenDestino = itemView.findViewById(R.id.imgvImagen);

        this.nombre = itemView.findViewById(R.id.tvNombre);
        this.nombre.setGravity(Gravity.CENTER_HORIZONTAL);
        this.nombre.setTypeface(null, Typeface.BOLD);

        this.descripcion = itemView.findViewById(R.id.etmDescripcion);
        this.descripcion.setGravity(Gravity.CENTER_HORIZONTAL);

        this.precio = itemView.findViewById(R.id.tvPrecio);
        this.precio.setGravity(Gravity.CENTER_HORIZONTAL);

        this.facilidad = itemView.findViewById(R.id.tvFailidad);
        this.facilidad.setGravity(Gravity.CENTER_HORIZONTAL);

        this.capaciadad = itemView.findViewById(R.id.tvCapacidad);
        this.capaciadad.setGravity(Gravity.CENTER_HORIZONTAL);

        this.provincia = itemView.findViewById(R.id.tvProvincia);
        this.provincia.setGravity(Gravity.CENTER_HORIZONTAL);

        this.botonVerMas = itemView.findViewById(R.id.buttonVerMasID);
        this.botonVerMas.setGravity(Gravity.CENTER_HORIZONTAL);

        this.imgRId = 0;
    }

}
