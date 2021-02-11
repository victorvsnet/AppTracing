package com.upc.apptracing.entidades;

public class ClienteProducto {
    private int id_cliente;
    private int id_producto;

    public ClienteProducto(int id_cliente, int id_producto) {
        this.id_cliente = id_cliente;
        this.id_producto = id_producto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
}
