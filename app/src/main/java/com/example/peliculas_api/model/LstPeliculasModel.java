package com.example.peliculas_api.model;

import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.entities.Peliculas;
import com.example.peliculas_api.utils.ApiInterface;
import com.example.peliculas_api.utils.ApiPeliculas;
import com.example.peliculas_api.view.LstPeliculasContract;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstPeliculasModel implements LstPeliculasContract.Model {

    @Override
    public void lstPeliculasWS(Peliculas pelicula, OnLstPeliculasListener onLstPeliculasListener) {
        ApiInterface apiService = ApiPeliculas.getPeliculas().create(ApiInterface.class);

        Call<Index> call = apiService.getApi();
        call.enqueue(new Callback<Index>() {
            @Override
            public void onResponse(Call<Index> call, Response<Index> response) {
                Index peliculasRespuesta = response.body();
                ArrayList<Peliculas> listaPeliculas = peliculasRespuesta.getPeliculas();

                onLstPeliculasListener.onSuccess(listaPeliculas);

            }

            @Override
            public void onFailure(Call<Index> call, Throwable t) {
                 onLstPeliculasListener.onFailure(t.getMessage());
            }
        });
    }
}
