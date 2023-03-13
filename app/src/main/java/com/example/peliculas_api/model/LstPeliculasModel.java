package com.example.peliculas_api.model;

import com.example.peliculas_api.entities.Peliculas;
import com.example.peliculas_api.entities.PeliculasRespuesta;
import com.example.peliculas_api.utils.ApiInterface;
import com.example.peliculas_api.utils.ApiPeliculas;
import com.example.peliculas_api.view.LstPeliculasContract;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstPeliculasModel implements LstPeliculasContract.Model {

    @Override
    public void lstPeliculasWS(Peliculas pelicula, OnLstPeliculasListener onLstPeliculasListener) {
        ApiInterface apiService = ApiPeliculas.getPeliculas().create(ApiInterface.class);

        Call<PeliculasRespuesta> call = apiService.getPeliculas();
        call.enqueue(new Callback<PeliculasRespuesta>() {
            @Override
            public void onResponse(Call<PeliculasRespuesta> call, Response<PeliculasRespuesta> response) {
                PeliculasRespuesta peliculasRespuesta = response.body();
                ArrayList<Peliculas> listaPeliculas = peliculasRespuesta.getResults();

                onLstPeliculasListener.onSuccess(listaPeliculas);

            }

            @Override
            public void onFailure(Call<PeliculasRespuesta> call, Throwable t) {
                 onLstPeliculasListener.onFailure("Erro en sacar la lista de peliculas");
            }
        });
    }
}
