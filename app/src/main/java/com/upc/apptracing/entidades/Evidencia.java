package com.upc.apptracing.entidades;

public class Evidencia {
    private int id_evidencia;
    private int id_puntoentrega;
    private String foto_evidencia;
    private String gls_comentario;

    public Evidencia(int id_puntoentrega, String foto_evidencia, String gls_comentario) {
        this.id_puntoentrega = id_puntoentrega;
        this.foto_evidencia = foto_evidencia;
        this.gls_comentario = gls_comentario;
    }

    public Evidencia(int id_evidencia, int id_puntoentrega, String foto_evidencia, String gls_comentario) {
        this.id_evidencia = id_evidencia;
        this.id_puntoentrega = id_puntoentrega;
        this.foto_evidencia = foto_evidencia;
        this.gls_comentario = gls_comentario;
    }

    public int getId_evidencia() {
        return id_evidencia;
    }

    public void setId_evidencia(int id_evidencia) {
        this.id_evidencia = id_evidencia;
    }

    public int getId_puntoentrega() {
        return id_puntoentrega;
    }

    public void setId_puntoentrega(int id_puntoentrega) {
        this.id_puntoentrega = id_puntoentrega;
    }

    public String getFoto_evidencia() {
        return foto_evidencia;
    }

    public void setFoto_evidencia(String foto_evidencia) {
        this.foto_evidencia = foto_evidencia;
    }

    public String getGls_comentario() {
        return gls_comentario;
    }

    public void setGls_comentario(String gls_comentario) {
        this.gls_comentario = gls_comentario;
    }
}
