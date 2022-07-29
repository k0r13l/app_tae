package com.mtz.tae.model;

public class RegistroUsuario {

    private int ubicacion;
    private int classEdad;
    private int rangoPrecios;
    private int capacidad;
    private int facilidad;
    private int actividadP;

    public RegistroUsuario(String datos[]) {
        switch (datos[0]) {
            case "Alajuela":
                this.ubicacion = 7;
                break;
            case "Cartago":
                this.ubicacion = 1;
                break;
            case "San José":
                this.ubicacion = 3;
                break;
            case "Guanacaste":
                this.ubicacion = 4;
                break;
            case "Heredia":
                this.ubicacion = 5;
                break;
            case "Puntarenas":
                this.ubicacion = 6;
                break;
            case "Otro":
                this.ubicacion = 8;
                break;
            case "Limón":
                this.ubicacion = 2;
                break;
        }

        switch (datos[1]) {
            case "Todo púclico":
                this.classEdad = 1;
                break;
            case "Mayores de 13 años":
                this.classEdad = 2;
                break;
            case "Mayores de 18 años":
                this.classEdad = 3;
                break;
        }

        switch (datos[2]) {
            case "₡5000 o menos":
                this.rangoPrecios = 1;
                break;
            case "Entre ₡5000 y ₡10000":
                this.rangoPrecios = 2;
                break;
            case "Entre ₡10000 y ₡20000":
                this.rangoPrecios = 3;
                break;
            case "Mayor a ₡20000":
                this.rangoPrecios = 4;
                break;
        }

        this.capacidad = Integer.parseInt(datos[3]);

        switch (datos[4]) {
            case "Parqueo":
                this.facilidad = 1;
                break;
            case "Spa":
                this.facilidad = 2;
                break;
            case "Alimentación":
                this.facilidad = 3;
                break;
        }

        switch (datos[5]) {
            case "Senderismo":
                this.actividadP = 1;
                break;
            case "Rafting":
                this.actividadP = 2;
                break;
            case "Cabalgata":
                this.actividadP = 3;
                break;
            case "Tour gastronómico":
                this.actividadP = 4;
                break;
            case "Actividad cultural":
                this.actividadP = 5;
                break;
            case "Surf":
                this.actividadP = 6;
                break;
            case "Apreciación de arte":
                this.actividadP = 7;
        }
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getClassEdad() {
        return classEdad;
    }

    public void setClassEdad(int classEdad) {
        this.classEdad = classEdad;
    }

    public int getRangoPrecios() {
        return rangoPrecios;
    }

    public void setRangoPrecios(int rangoPrecios) {
        this.rangoPrecios = rangoPrecios;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getFacilidad() {
        return facilidad;
    }

    public void setFacilidad(int facilidad) {
        this.facilidad = facilidad;
    }

    public int getActividadP() {
        return actividadP;
    }

    public void setActividadP(int actividadP) {
        this.actividadP = actividadP;
    }
}
