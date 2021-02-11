package com.upc.apptracing.entidades;

public class EstadosEntrega {
    private int id_estado;
    private String gls_estado;

    public EstadosEntrega(String gls_estado) {
        this.gls_estado = gls_estado;
    }

    public EstadosEntrega(int id_estado, String gls_estado) {
        this.id_estado = id_estado;
        this.gls_estado = gls_estado;
    }

    public int getId_estado() {
        return id_estado;
    }

    public String getGls_estado() {
        return gls_estado;
    }
}
