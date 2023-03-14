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
}
