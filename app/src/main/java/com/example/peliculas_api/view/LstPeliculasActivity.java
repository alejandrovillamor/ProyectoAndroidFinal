package com.example.peliculas_api.view;

import androidx.appcompat.app.AppCompatActivity;

import com.example.peliculas_api.entities.Peliculas;

import java.util.ArrayList;

public class LstPeliculasActivity extends AppCompatActivity implements LstPeliculasContract.View {

    @Override
    public void successLstPeliculas(ArrayList<Peliculas> lstPeliculas) {

    }

    @Override
    public void failureLstPeliculas(String err) {

    }
}
