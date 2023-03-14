package com.example.peliculas_api.utils;

import com.example.peliculas_api.entities.PeliculasRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {
    @GET("api")
    Call<PeliculasRespuesta> getPeliculas();
}
