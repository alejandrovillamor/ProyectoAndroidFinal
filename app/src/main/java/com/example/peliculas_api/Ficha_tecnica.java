package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.entities.Peliculas;
import com.example.peliculas_api.presenter.LstPeliculasPresenter;
import com.example.peliculas_api.utils.ApiInterface;
import com.example.peliculas_api.view.LstPeliculasContract;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Ficha_tecnica extends AppCompatActivity implements LstPeliculasContract.View {



    private LstPeliculasPresenter lstPeliculasPresenter;
    private TextView nombre;
    private TextView tituloOriginal;
    private TextView director;
    private TextView pais;
    private TextView ano;
    private TextView duracion;
    private TextView genero;
    private TextView calificacion;
    private TextView reparto;
    private TextView productora;
    private TextView trailer;
    ImageView flecha;
    private Integer id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_tecnica);

        initComponents();
        initPresenter();
        initData();

        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Filtros_peliculas_Activity.class
                );
                startActivity(screenChanger);
            }
        });
    }

    public void initComponents(){
        nombre = findViewById(R.id.idTitulo);
        tituloOriginal = findViewById(R.id.idTituloOriginal);
        director = findViewById(R.id.idDireccion);
        pais = findViewById(R.id.idPais);
        ano = findViewById(R.id.idAno);
        duracion = findViewById(R.id.idDuracion);
        genero = findViewById(R.id.idGenero);
        calificacion = findViewById(R.id.idCalificacion);
        reparto = findViewById(R.id.idReparto);
        productora = findViewById(R.id.idProductora);
        trailer = findViewById(R.id.idTrailer);

    }

    public  void initPresenter(){
        lstPeliculasPresenter = new LstPeliculasPresenter(this);
    }

    public void initData(){
        lstPeliculasPresenter.lstPeliculas(null);
    }

    @Override
    public void successLstPeliculas(ArrayList<Index> lstIndex) {
        for (Peliculas peliculas: lstIndex.get(0).getPeliculas()) {
            Bundle miBundle = this.getIntent().getExtras();
            if(miBundle!=null) {
                id = miBundle.getInt("idPeli");
                if (id.equals(peliculas.getId_pelicula())) {
                    nombre.setText(peliculas.getNombre());
                    tituloOriginal.setText(peliculas.getNombre());
                    director.setText(peliculas.getDirector());
                    pais.setText(peliculas.getPais());
                   // ano.setText(peliculas.getAno());
                    duracion.setText(peliculas.getDuracion());
                    genero.setText(peliculas.getGenero());
                    calificacion.setText(peliculas.getClasificacion());
                    reparto.setText(peliculas.getInterpretes());
                    productora.setText(peliculas.getDistribuidora());
                    trailer.setText(peliculas.getTrailer());
                }
            }
        }

    }

    @Override
    public void failureLstPeliculas(String err) {
        Toast.makeText(this,err,Toast.LENGTH_LONG).show();
    }
}