package com.example.peliculas_api.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PeliculasRespuesta {
    @SerializedName("results")
    private ArrayList<Peliculas> results;

    public ArrayList<Peliculas> getResults() {
        return results;
    }

    public void setResults(ArrayList<Peliculas> results) {
        this.results = results;
    }
}
