package com.upc.apptracing.entidades;

public class PuntosEntrega {
    private int id_puntoentrega;
    private int id_conductor;
    private int id_cliente;
    private int nro_orden;
    private int estado;
    private String fecha_hora;

    public PuntosEntrega(int id_conductor, int id_cliente, int nro_orden, int estado, String fecha_hora) {
        this.id_conductor = id_conductor;
        this.id_cliente = id_cliente;
        this.nro_orden = nro_orden;
        this.estado = estado;
        this.fecha_hora = fecha_hora;
    }

    public PuntosEntrega(int id_puntoentrega, int id_conductor, int id_cliente, int nro_orden, int estado, String fecha_hora) {
        this.id_puntoentrega = id_puntoentrega;
        this.id_conductor = id_conductor;
        this.id_cliente = id_cliente;
        this.nro_orden = nro_orden;
        this.estado = estado;
        this.fecha_hora = fecha_hora;
    }

    public int getId_puntoentrega() {
        return id_puntoentrega;
    }

    public void setId_puntoentrega(int id_puntoentrega) {
        this.id_puntoentrega = id_puntoentrega;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getNro_orden() {
        return nro_orden;
    }

    public void setNro_orden(int nro_orden) {
        this.nro_orden = nro_orden;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }
}
