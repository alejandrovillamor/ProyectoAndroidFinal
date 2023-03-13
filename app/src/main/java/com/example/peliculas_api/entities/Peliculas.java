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
                '}';
    }
}
