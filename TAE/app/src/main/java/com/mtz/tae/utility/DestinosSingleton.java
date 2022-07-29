package com.mtz.tae.utility;

import com.mtz.tae.model.Destino;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DestinosSingleton {
    public static DestinosSingleton instance;
    public List<Destino> listaDestinos;

    private DestinosSingleton() {
        this.listaDestinos = new ArrayList<>();
    }

    public static DestinosSingleton getInstance() {
        if (instance == null) {
            instance = new DestinosSingleton();
        }
        return instance;
    }
}
