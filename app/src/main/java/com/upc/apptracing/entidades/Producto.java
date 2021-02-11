package com.upc.apptracing.entidades;

public class Producto {
    private int id_producto;
    private String gls_producto;
    private String gls_descripcion;

    public Producto(String gls_producto, String gls_descripcion) {
        this.gls_producto = gls_producto;
        this.gls_descripcion = gls_descripcion;
    }

    public Producto(int id_producto, String gls_producto, String gls_descripcion) {
        this.id_producto = id_producto;
        this.gls_producto = gls_producto;
        this.gls_descripcion = gls_descripcion;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getGls_producto() {
        return gls_producto;
    }

    public void setGls_producto(String gls_producto) {
        this.gls_producto = gls_producto;
    }

    public String getGls_descripcion() {
        return gls_descripcion;
    }

    public void setGls_descripcion(String gls_descripcion) {
        this.gls_descripcion = gls_descripcion;
    }
}
