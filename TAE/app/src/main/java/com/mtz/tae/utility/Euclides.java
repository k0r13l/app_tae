package com.mtz.tae.utility;

import com.mtz.tae.model.Destino;
import com.mtz.tae.model.RegistroEuclides;
import com.mtz.tae.model.RegistroUsuario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Euclides {

    private List<Destino> listaDestinos;
    private RegistroUsuario registroUsuario;
    private String clase;
    private String salida;

    public Euclides(List<Destino> listaDestinos, RegistroUsuario registroUsuario){
        this.listaDestinos = listaDestinos;
        this.registroUsuario = registroUsuario;
        this.clase = "";
        this.salida = "";
        procesar();
    }

    private void procesar() {
        for (Destino item:
                this.listaDestinos) {
            switch (item.precio) {
                case 5000:
                    item.precio = 1;
                    break;
                case 10000:
                    item.precio = 2;
                    break;
                case 15000:
                    item.precio = 3;
                    break;
                case 20000:
                    item.precio = 4;
                    break;
            }
        }
    }
    private void calcular() {
        double suma = 0;
        int i = 0;
        ArrayList<RegistroEuclides> lista = new ArrayList<>();
        for (Destino item:
                this.listaDestinos) {
            suma += Math.sqrt(Math.pow(item.provincia - this.registroUsuario.getUbicacion(), 2));
            suma += Math.sqrt(Math.pow(item.clasificacion_edad - this.registroUsuario.getClassEdad(), 2));
            suma += Math.sqrt(Math.pow(item.precio - this.registroUsuario.getRangoPrecios(), 2));
            suma += Math.sqrt(Math.pow(item.capacidad - this.registroUsuario.getCapacidad(), 2));
            suma += Math.sqrt(Math.pow(item.facilidad - this.registroUsuario.getFacilidad(), 2));
            suma += Math.sqrt(Math.pow(item.actividad_principal - this.registroUsuario.getActividadP(), 2));
            lista.add(new RegistroEuclides(suma, item.clase));

            suma = 0;
            i++;
        }

        Collections.sort(lista);
        for (RegistroEuclides item:
             lista) {
            System.out.println(item.getClase() + " " + item.getValor());
        }

        this.clase = lista.get(0).getClase();

    }

    public String getSalida() {
        return this.salida;
    }

    public List<Destino> obtenerDestinos() {
        calcular();
        List<Destino> destinosPredecidos = new ArrayList<>();

        for (Destino item:
             DestinosSingleton.getInstance().listaDestinos) {
            if (item.clase.equalsIgnoreCase(this.clase)) {
                destinosPredecidos.add(item);
            }
        }

        return destinosPredecidos;
    }

    public List<Destino> getListaDestinos() {
        return listaDestinos;
    }

    public void setListaDestinos(List<Destino> listaDestinos) {
        this.listaDestinos = listaDestinos;
    }

    public RegistroUsuario getRegistroUsuario() {
        return registroUsuario;
    }

    public void setRegistroUsuario(RegistroUsuario registroUsuario) {
        this.registroUsuario = registroUsuario;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
