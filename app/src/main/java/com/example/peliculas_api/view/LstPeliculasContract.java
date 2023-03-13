package com.example.peliculas_api.view;

import com.example.peliculas_api.entities.Peliculas;

import java.util.ArrayList;

public interface LstPeliculasContract {
    public  interface  View{
        void successLstPeliculas(ArrayList<Peliculas> lstPeliculas);
        void failureLstPeliculas(String err);
    }
    public interface  Presenter{
        void lstPeliculas(Peliculas pelicula);
    }
    public interface  Model{
        interface  OnLstPeliculasListener{
            void  onSuccess(ArrayList<Peliculas> pelicula);
            void  onFailure(String error);
        }
        void lstPeliculasWS(Peliculas pelicula, OnLstPeliculasListener onLstPeliculasListener);

    }
}
