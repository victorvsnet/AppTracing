package com.upc.apptracing.entidades;

public class Conductor {
    private int id_conductor;
    private String gls_nombre;
    private String gls_apellido;
    private String num_dni;
    private String contrasenia;
    private int estado;
    private String num_telefono;
    private String num_licencia;
    private String fec_vencimiento;


    public Conductor(String gls_nombre, String gls_apellido, String num_dni, String contrasenia, int estado, String num_telefono, String num_licencia, String fec_vencimiento) {
        this.gls_nombre = gls_nombre;
        this.gls_apellido = gls_apellido;
        this.num_dni = num_dni;
        this.contrasenia = contrasenia;
        this.estado = estado;
        this.num_telefono = num_telefono;
        this.num_licencia = num_licencia;
        this.fec_vencimiento = fec_vencimiento;
    }

    public Conductor(int id_conductor, String gls_nombre, String gls_apellido, String num_dni, String contrasenia, int estado, String num_telefono, String num_licencia, String fec_vencimiento) {
        this.id_conductor = id_conductor;
        this.gls_nombre = gls_nombre;
        this.gls_apellido = gls_apellido;
        this.num_dni = num_dni;
        this.contrasenia = contrasenia;
        this.estado = estado;
        this.num_telefono = num_telefono;
        this.num_licencia = num_licencia;
        this.fec_vencimiento = fec_vencimiento;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getNum_licencia() {
        return num_licencia;
    }

    public void setNum_licencia(String num_licencia) {
        this.num_licencia = num_licencia;
    }

    public String getFec_vencimiento() {
        return fec_vencimiento;
    }

    public void setFec_vencimiento(String fec_vencimiento) {
        this.fec_vencimiento = fec_vencimiento;
    }
}
