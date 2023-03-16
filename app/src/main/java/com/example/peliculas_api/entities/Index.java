package com.example.peliculas_api.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Index {
    @SerializedName("peliculas")
    private ArrayList<Peliculas> peliculas;

    public ArrayList<Peliculas> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }

   @SerializedName("peliculasDrama")
    private ArrayList<Peliculas> peliculasdrama;

    public ArrayList<Peliculas> getPeliculasDrama() {
        return peliculasdrama;
    }

    public void setPeliculasDrama(ArrayList<Peliculas> peliculasdrama) {
        this.peliculasdrama = peliculasdrama;
    }

    @SerializedName("peliculasAccion")
    private ArrayList<Peliculas> peliculasaccion;

    public ArrayList<Peliculas> getPeliculasAccion() {
        return peliculasaccion;
    }

    public void setPeliculasAccion(ArrayList<Peliculas> peliculasaccion) {
        this.peliculasaccion = peliculasaccion;
    }

    @SerializedName("peliculasMasvotadas")
    private ArrayList<Peliculas> peliculasMasvotadas;

    public ArrayList<Peliculas> getPeliculasMasvotadas() {
        return peliculasMasvotadas;
    }

    public void setPeliculasMasvotadas(ArrayList<Peliculas> peliculasMasvotadas) {
        this.peliculasMasvotadas = peliculasMasvotadas;
    }
}
