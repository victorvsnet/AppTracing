package com.upc.apptracing.entidades;

public class VehiculoConductor {
    private String placa;
    private int id_conductor;

    public VehiculoConductor(String placa, int id_conductor) {
        this.placa = placa;
        this.id_conductor = id_conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }
}
