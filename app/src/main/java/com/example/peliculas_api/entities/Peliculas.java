package com.example.peliculas_api.entities;

import com.google.gson.annotations.SerializedName;

public class Peliculas {

 @SerializedName("name")
    private String name;

 @SerializedName("duracion")
 private String duracion;

 @SerializedName("clasificacion")
 private String clasificacion;

 @SerializedName("director")
 private String director;

    @SerializedName("interpretes")
    private String interpretes;

    @SerializedName("trailer")
    private String trailer;

    @SerializedName("musica")
    private String musica;

    @SerializedName("año")
    private int año;
    @SerializedName("distribuidora")
    private String distribuidora;
    @SerializedName("comentarios")
    private String comentarios;
    @SerializedName("presupuesto")
    private int presupuesto;
    @SerializedName("imagen")
    private String imagen;
    @SerializedName("valoracion")
    private int valoracion;
    @SerializedName("sinopsis")
    private String sinopsis;
    @SerializedName("pais")
    private String pais;
    @SerializedName("genero")
    private String genero;

    @Override
    public String toString() {
        return "Peliculas{" +
                "name='" + name + '\'' +
                ", duracion='" + duracion + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", director='" + director + '\'' +
                ", interpretes='" + interpretes + '\'' +
                ", trailer='" + trailer + '\'' +
                ", musica='" + musica + '\'' +
                ", año=" + año +
                ", distribuidora='" + distribuidora + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", presupuesto=" + presupuesto +
                ", imagen='" + imagen + '\'' +
                ", valoracion=" + valoracion +
                ", sinopsis='" + sinopsis + '\'' +
                ", pais='" + pais + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAño() {
        return año;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public int getValoracion() {
        return valoracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public String getDirector() {
        return director;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getImagen() {
        return imagen;
    }

    public String getInterpretes() {
        return interpretes;
    }

    public String getMusica() {
        return musica;
    }

    public String getName() {
        return name;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
