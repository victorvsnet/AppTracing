package com.upc.apptracing.entidades;

public class Vehiculo {
    private String placa;
    private String gls_marca;
    private String gls_modelo;
    private int anio;

    public Vehiculo(String placa, String gls_marca, String gls_modelo, int anio) {
        this.placa = placa;
        this.gls_marca = gls_marca;
        this.gls_modelo = gls_modelo;
        this.anio = anio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getGls_marca() {
        return gls_marca;
    }

    public void setGls_marca(String gls_marca) {
        this.gls_marca = gls_marca;
    }

    public String getGls_modelo() {
        return gls_modelo;
    }

    public void setGls_modelo(String gls_modelo) {
        this.gls_modelo = gls_modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
