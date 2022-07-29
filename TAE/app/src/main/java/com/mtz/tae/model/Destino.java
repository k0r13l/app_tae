package com.mtz.tae.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Destino {

    @SerializedName("idDestino")
    @Expose
    public int id;

    @SerializedName("nombre")
    @Expose
    public String nombre;

    @SerializedName("descripcion")
    @Expose
    public String descripcion;

    @SerializedName("precio")
    @Expose
    public int precio;

    @SerializedName("capacidad")
    @Expose
    public int capacidad;

    @SerializedName("img")
    @Expose
    public String img;

    @SerializedName("provincia")
    @Expose
    public int provincia;

    @SerializedName("clasificacion_Edad")
    @Expose
    public int clasificacion_edad;

    @SerializedName("actividad_Principal")
    @Expose
    public int actividad_principal;

    @SerializedName("facilidad")
    @Expose
    public int facilidad;

    @SerializedName("clase")
    @Expose
    public String clase;

    @SerializedName("longitud")
    @Expose
    public String longitud;

    @SerializedName("latitud")
    @Expose
    public String latitud;

    @Override
    public String toString() {
        return "Destino{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", capacidad=" + capacidad +
                ", img='" + img + '\'' +
                ", provincia=" + provincia +
                ", clasificacion_edad=" + clasificacion_edad +
                ", actividad_principal=" + actividad_principal +
                ", facilidad=" + facilidad +
                ", clase='" + clase + '\'' +
                '}';
    }
}
