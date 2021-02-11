package com.upc.apptracing.entidades;

public class Cliente {
    private int id_cliente;
    private String gls_nombre;
    private String gls_apellido;
    private String num_dni;
    private String num_telefono;
    private String gls_direccion;

    public Cliente(String gls_nombre, String gls_apellido, String num_dni, String num_telefono, String gls_direccion) {
        this.gls_nombre = gls_nombre;
        this.gls_apellido = gls_apellido;
        this.num_dni = num_dni;
        this.num_telefono = num_telefono;
        this.gls_direccion = gls_direccion;
    }

    public Cliente(int id_cliente, String gls_nombre, String gls_apellido, String num_dni, String num_telefono, String gls_direccion) {
        this.id_cliente = id_cliente;
        this.gls_nombre = gls_nombre;
        this.gls_apellido = gls_apellido;
        this.num_dni = num_dni;
        this.num_telefono = num_telefono;
        this.gls_direccion = gls_direccion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getGls_nombre() {
        return gls_nombre;
    }

    public void setGls_nombre(String gls_nombre) {
        this.gls_nombre = gls_nombre;
    }

    public String getGls_apellido() {
        return gls_apellido;
    }

    public void setGls_apellido(String gls_apellido) {
        this.gls_apellido = gls_apellido;
    }

    public String getNum_dni() {
        return num_dni;
    }

    public void setNum_dni(String num_dni) {
        this.num_dni = num_dni;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getGls_direccion() {
        return gls_direccion;
    }

    public void setGls_direccion(String gls_direccion) {
        this.gls_direccion = gls_direccion;
    }
}
