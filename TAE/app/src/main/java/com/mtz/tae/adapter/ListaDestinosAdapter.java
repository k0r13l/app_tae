package com.mtz.tae.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.mtz.tae.model.Destino;
import com.mtz.tae.ui.dialogdestino.DialogDestinoFragment;
import com.mtz.tae.viewHolder.DestinoVH;
import com.mtz.tae.R;

import java.util.List;

public class ListaDestinosAdapter extends RecyclerView.Adapter<DestinoVH>{

    private List<Destino> destinos;
    private Fragment fragment;

    public ListaDestinosAdapter(List<Destino> destinos, Fragment fragment) {
        this.destinos = destinos;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public DestinoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemLista = inflater.inflate(R.layout.item_destino, parent, false);
        return new DestinoVH(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull DestinoVH holder, int position) {
        final Destino destino = this.destinos.get(position);

        switch(destino.img) {
            case "manuel.jpg":
                holder.imagenDestino.setImageResource(R.drawable.manuel);
                holder.imgRId = R.drawable.manuel;
                break;
            case "arrecife.jpg":
                holder.imagenDestino.setImageResource(R.drawable.arrecife);
                holder.imgRId = R.drawable.arrecife;
                break;
            case "coco.jpg":
                holder.imagenDestino.setImageResource(R.drawable.coco);
                holder.imgRId = R.drawable.coco;
                break;
            case "ballena.jpg":
                holder.imagenDestino.setImageResource(R.drawable.ballena);
                holder.imgRId = R.drawable.ballena;
                break;
            case "balsa.jpg":
                holder.imagenDestino.setImageResource(R.drawable.balsa);
                holder.imgRId = R.drawable.balsa;
                break;
            case "cahuita.jpg":
                holder.imagenDestino.setImageResource(R.drawable.cahuita);
                holder.imgRId = R.drawable.cahuita;
                break;
            case "carrillo.jpg":
                holder.imagenDestino.setImageResource(R.drawable.carrillo);
                holder.imgRId = R.drawable.carrillo;
                break;
            case "catarata.jpg":
                holder.imagenDestino.setImageResource(R.drawable.catarata);
                holder.imgRId = R.drawable.catarata;
                break;
            case "celeste.jpg":
                holder.imagenDestino.setImageResource(R.drawable.celeste);
                holder.imgRId = R.drawable.celeste;
                break;
            case "conchal.jpg":
                holder.imagenDestino.setImageResource(R.drawable.conchal);
                holder.imgRId = R.drawable.conchal;
                break;
            case "danta.jpg":
                holder.imagenDestino.setImageResource(R.drawable.danta);
                holder.imgRId = R.drawable.danta;
                break;
            case "flamingo.jpg":
                holder.imagenDestino.setImageResource(R.drawable.flamingo);
                holder.imgRId = R.drawable.flamingo;
                break;
            case "guayabo.jpg":
                holder.imagenDestino.setImageResource(R.drawable.guayabo);
                holder.imgRId = R.drawable.guayabo;
                break;
            case "hacienda.jpg":
                holder.imagenDestino.setImageResource(R.drawable.hacienda);
                holder.imgRId = R.drawable.hacienda;
                break;
            case "hacienda6.jpg":
                holder.imagenDestino.setImageResource(R.drawable.hacienda6);
                holder.imgRId = R.drawable.hacienda6;
                break;
            case "hermosa.jpg":
                holder.imagenDestino.setImageResource(R.drawable.hermosa);
                holder.imgRId = R.drawable.hermosa;
                break;
            case "herradura.jpg":
                holder.imagenDestino.setImageResource(R.drawable.herradura);
                holder.imgRId = R.drawable.herradura;
                break;
            case "img1.jpg":
                holder.imagenDestino.setImageResource(R.drawable.img1);
                holder.imgRId = R.drawable.img1;
                break;
            case "img2.jpg":
                holder.imagenDestino.setImageResource(R.drawable.img2);
                holder.imgRId = R.drawable.img2;
                break;
            case "img3.jpg":
                holder.imagenDestino.setImageResource(R.drawable.img3);
                holder.imgRId = R.drawable.img3;
                break;
            case "img4.jpg":
                holder.imagenDestino.setImageResource(R.drawable.img4);
                holder.imgRId = R.drawable.img4;
                break;
            case "img5.jpg":
                holder.imagenDestino.setImageResource(R.drawable.img5);
                holder.imgRId = R.drawable.img5;
                break;
            case "img6.jpg":
                holder.imagenDestino.setImageResource(R.drawable.img6);
                holder.imgRId = R.drawable.img6;
                break;
            case "img7.jpg":
                holder.imagenDestino.setImageResource(R.drawable.img7);
                holder.imgRId = R.drawable.img7;
                break;
            case "img8.jpg":
                holder.imagenDestino.setImageResource(R.drawable.img8);
                holder.imgRId = R.drawable.img8;
                break;
            case "img9.jpg":
                holder.imagenDestino.setImageResource(R.drawable.img9);
                holder.imgRId = R.drawable.img9;
                break;
            case "irazu.jpg":
                holder.imagenDestino.setImageResource(R.drawable.irazu);
                holder.imgRId = R.drawable.irazu;
                break;
            case "jaco.jpg":
                holder.imagenDestino.setImageResource(R.drawable.jaco);
                holder.imgRId = R.drawable.jaco;
                break;
            case "junquillal.jpg":
                holder.imagenDestino.setImageResource(R.drawable.junquillal);
                holder.imgRId = R.drawable.junquillal;
                break;
            case "lagartillo.jpg":
                holder.imagenDestino.setImageResource(R.drawable.lagartillo);
                holder.imgRId = R.drawable.lagartillo;
                break;
            case "manzanillo.jpg":
                holder.imagenDestino.setImageResource(R.drawable.manzanillo);
                holder.imgRId = R.drawable.manzanillo;
                break;
            case "marta.jpg":
                holder.imagenDestino.setImageResource(R.drawable.marta);
                holder.imgRId = R.drawable.marta;
                break;
            case "miravalles.jpg":
                holder.imagenDestino.setImageResource(R.drawable.miravalles);
                holder.imgRId = R.drawable.miravalles;
                break;
            case "moin.jpg":
                holder.imagenDestino.setImageResource(R.drawable.moin);
                holder.imgRId = R.drawable.moin;
                break;
            case "montezuma.jpg":
                holder.imagenDestino.setImageResource(R.drawable.montezuma);
                holder.imgRId = R.drawable.montezuma;
                break;
            case "museo.jpg":
                holder.imagenDestino.setImageResource(R.drawable.museo);
                holder.imgRId = R.drawable.museo;
                break;
            case "naranjo.jpg":
                holder.imagenDestino.setImageResource(R.drawable.naranjo);
                holder.imgRId = R.drawable.naranjo;
                break;
            case "negra.jpg":
                holder.imagenDestino.setImageResource(R.drawable.negra);
                holder.imgRId = R.drawable.negra;
                break;
            case "nosara.jpg":
                holder.imagenDestino.setImageResource(R.drawable.nosara);
                holder.imgRId = R.drawable.nosara;
                break;
            case "pacuare.jpg":
                holder.imagenDestino.setImageResource(R.drawable.pacuare);
                holder.imgRId = R.drawable.pacuare;
                break;
            case "pasqui.jpg":
                holder.imagenDestino.setImageResource(R.drawable.pasqui);
                holder.imgRId = R.drawable.pasqui;
                break;
            case "pejivalle.jpg":
                holder.imagenDestino.setImageResource(R.drawable.pejivalle);
                holder.imgRId = R.drawable.pejivalle;
                break;
            case "playa.jpg":
                holder.imagenDestino.setImageResource(R.drawable.playa);
                holder.imgRId = R.drawable.playa;
                break;
            case "potrero.jpg":
                holder.imagenDestino.setImageResource(R.drawable.potrero);
                holder.imgRId = R.drawable.potrero;
                break;
            case "prusia.jpg":
                holder.imagenDestino.setImageResource(R.drawable.prusia);
                holder.imgRId = R.drawable.prusia;
                break;
            case "puerto.jpg":
                holder.imagenDestino.setImageResource(R.drawable.puerto);
                holder.imgRId = R.drawable.puerto;
                break;
            case "puntarenas.jpg":
                holder.imagenDestino.setImageResource(R.drawable.puntarenas);
                holder.imgRId = R.drawable.puntarenas;
                break;
            case "restaurante.jpg":
                holder.imagenDestino.setImageResource(R.drawable.restaurante);
                holder.imgRId = R.drawable.restaurante;
                break;
            case "reventazon.jpg":
                holder.imagenDestino.setImageResource(R.drawable.reventazon);
                holder.imgRId = R.drawable.reventazon;
                break;
            case "samara.jpg":
                holder.imagenDestino.setImageResource(R.drawable.samara);
                holder.imgRId = R.drawable.samara;
                break;
            case "sarapiqui.jpg":
                holder.imagenDestino.setImageResource(R.drawable.sarapiqui);
                holder.imgRId = R.drawable.sarapiqui;
                break;
            case "savegre.jpg":
                holder.imagenDestino.setImageResource(R.drawable.savegre);
                holder.imgRId = R.drawable.savegre;
                break;
            case "talamanca.jpg":
                holder.imagenDestino.setImageResource(R.drawable.talamanca);
                holder.imgRId = R.drawable.talamanca;
                break;
            case "tamarindo.jpg":
                holder.imagenDestino.setImageResource(R.drawable.tamarindo);
                holder.imgRId = R.drawable.tamarindo;
                break;
            case "tambor.jpg":
                holder.imagenDestino.setImageResource(R.drawable.tambor);
                holder.imgRId = R.drawable.tambor;
                break;
            case "tortuga.jpg":
                holder.imagenDestino.setImageResource(R.drawable.tortuga);
                holder.imgRId = R.drawable.tortuga;
                break;
            case "uvita.jpg":
                holder.imagenDestino.setImageResource(R.drawable.uvita);
                holder.imgRId = R.drawable.uvita;
                break;
            case "volcan.jpg":
                holder.imagenDestino.setImageResource(R.drawable.volcan);
                holder.imgRId = R.drawable.volcan;
                break;
        }

        /**
         * Esto es meramente estético
         * */
        switch (destino.precio) {
            case 1:
                destino.precio = 5000;
                break;
            case 2:
                destino.precio = 10000;
                break;
            case 3:
                destino.precio = 15000;
                break;
            case 4:
                destino.precio = 20000;
                break;
        }

        String precio = "Precio:\n₡" + destino.precio;
        String capacidad = "Capacidad:\n" + destino.capacidad;

        if (destino.capacidad == 1) {
            capacidad +=   " persona";
        } else {
            capacidad += " personas";
        }

        String facilidad = "Facilidades:\n";

        switch (destino.facilidad) {
            case 1:
                facilidad += "Parqueo";
                break;
            case 2:
                facilidad += "Spa";
                break;
            case 3:
                facilidad += "Alimentación";
                break;
        }
        String provincia = "Provincia:\n";
        switch (destino.provincia) {
            case 1:
                provincia += "Cartago";
                break;
            case 2:
                provincia += "Limón";
                break;
            case 3:
                provincia += "San José";
                break;
            case 4:
                provincia += "Guanacaste";
                break;
            case 5:
                provincia += "Heredia";
                break;
            case 6:
                provincia += "Puntarenas";
                break;
            case 7:
                provincia += "Alajuela";
                break;
            default: provincia = "Extranjero";
        }
        holder.provincia.setText(provincia);
        holder.precio.setText(precio);
        holder.capaciadad.setText(capacidad);
        holder.facilidad.setText(facilidad);

        holder.nombre.setText(destino.nombre);
        holder.descripcion.setText(destino.descripcion);

        holder.botonVerMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogDestinoFragment dialog = new DialogDestinoFragment();
                dialog.setNombre(destino.nombre);
                dialog.setDescripcion(destino.descripcion);
                dialog.setProvincia(holder.provincia.getText().toString());
                dialog.setPrecio(holder.provincia.getText().toString());
                dialog.setCapacidad(holder.capaciadad.getText().toString());
                dialog.setFacilidades(holder.facilidad.getText().toString());

                dialog.setImg(holder.imgRId);

                dialog.setLatitud(Double.parseDouble(destino.latitud));
                dialog.setLongitud(Double.parseDouble(destino.longitud));
                
                dialog.show(fragment.getActivity().getSupportFragmentManager(), "s");

            }
        });
    }

    @Override
    public int getItemCount() {
        return this.destinos.size();
    }
}
