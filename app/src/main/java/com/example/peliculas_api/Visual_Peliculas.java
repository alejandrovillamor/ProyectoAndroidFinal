package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.peliculas_api.entities.Peliculas;
import com.example.peliculas_api.presenter.LstPeliculasPresenter;
import com.example.peliculas_api.view.LstPeliculasContract;


import java.util.ArrayList;

public class Visual_Peliculas extends AppCompatActivity implements LstPeliculasContract.View {

    ArrayList<Peliculas> lstPeliculas;
    LstPeliculasPresenter lstPeliculasPresenter;
    ImageView imgPeli;
    Button ficatecnica;
    ImageView estrella1;
    ImageView estrella2;
    ImageView estrella3;
    ImageView estrella4;
    ImageView estrella5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.visual_pelicula);

        initComponentes();
        initPresenter();
        initData();

        ficatecnica = (Button) findViewById(R.id.idFichatecnica);
        ficatecnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Ficha_tecnica.class
                );
                startActivity(screenChanger);
            }
        });

        estrella1 = (ImageView) findViewById(R.id.estrella1);
        estrella1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        estrella2 = (ImageView) findViewById(R.id.estrella2);
        estrella2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        estrella3 = (ImageView) findViewById(R.id.estrella3);
        estrella3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        estrella4 = (ImageView) findViewById(R.id.estrella4);
        estrella4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        estrella5 = (ImageView) findViewById(R.id.estrella5);
        estrella5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void initComponentes() {
        lstPeliculas = new ArrayList<>();
        imgPeli = findViewById(R.id.idImgPeli);
    }


    public  void initPresenter(){

        lstPeliculasPresenter = new LstPeliculasPresenter(this);
    }

    public void initData(){

        lstPeliculasPresenter.lstPeliculas(null);
    }

    @Override
    public void successLstPeliculas(ArrayList<Peliculas> lstPeliculas) {
        for (Peliculas pelicula: lstPeliculas){
            Glide.with(getBaseContext())
                    .load( pelicula.getImagen()+".jpg")
                    .centerCrop()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(imgPeli);
            lstPeliculas.add(pelicula);
        }
    }

    @Override
    public void failureLstPeliculas(String err) {


    }
}