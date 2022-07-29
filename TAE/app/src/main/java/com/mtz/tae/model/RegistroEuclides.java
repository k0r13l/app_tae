package com.mtz.tae.model;

public class RegistroEuclides implements Comparable<RegistroEuclides>{

    private double valor;
    private String clase;

    public RegistroEuclides(double valor, String clase) {
        this.valor = valor;
        this.clase = clase;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public double getValor() {
        return valor;
    }

    public String getClase() {
        return clase;
    }

    @Override
    public int compareTo(RegistroEuclides e) {
        return Double.compare(e.getValor(), this.valor);
    }
}
