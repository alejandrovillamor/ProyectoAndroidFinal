package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.entities.Peliculas;
import com.example.peliculas_api.presenter.LstPeliculasPresenter;
import com.example.peliculas_api.view.LstPeliculasContract;
import com.example.peliculas_api.view.lstPeliculasAdapter;

import java.util.ArrayList;

public class lstPeliculas extends AppCompatActivity implements LstPeliculasContract.View {


   String texto;
   ImageView flecha;
   String Drama = "Drama";
   String Accion = "Accion";
   String Cinco = "Cinco";
    ArrayList<Peliculas> lstPeliculas;
    LstPeliculasPresenter lstPeliculasPresenter;
    ImageView imgPeli;
    RecyclerView recyclerPeliculas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lstpeliculas);




           initComponentes();
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
    private void initComponentes() {
        lstPeliculas = new ArrayList<>();
        imgPeli = findViewById(R.id.idImgPeli);
        flecha = (ImageView) findViewById(R.id.idFlechalstPelis);

    }


    public  void initPresenter(){

        lstPeliculasPresenter = new LstPeliculasPresenter(this);
    }

    public void initData(){

        lstPeliculasPresenter.lstPeliculas(null);
    }


    @Override
    public void successLstPeliculas(ArrayList<Index> lstIndex) {
        Bundle miBundle = this.getIntent().getExtras();
        if(miBundle!=null){
            texto = miBundle.getString("Filtro");
            if(texto.equals(Drama)){
                lstPeliculas = lstIndex.get(0).getPeliculasDrama();



                Toast.makeText(this, "Peliculas de "+texto, Toast.LENGTH_SHORT).show();
            }
            if(texto.equals(Accion)){
                lstPeliculas = lstIndex.get(0).getPeliculasAccion();
                Toast.makeText(this,"Peliculas de "+texto, Toast.LENGTH_SHORT).show();
            }
            if(texto.equals(Cinco)){
                lstPeliculas = lstIndex.get(0).getPeliculasMasvotadas();
                Toast.makeText(this, "Peliculas con una valoracion"+texto, Toast.LENGTH_SHORT).show();
            }

        }else {
            lstPeliculas = lstIndex.get(0).getPeliculas();
        }

        recyclerPeliculas = (RecyclerView) findViewById(R.id.recyclerViewPelis);
        recyclerPeliculas.setLayoutManager(new LinearLayoutManager(this));

        lstPeliculasAdapter adapter = new lstPeliculasAdapter(lstPeliculas,this);


        recyclerPeliculas.setAdapter(adapter);





    }

    @Override
    public void failureLstPeliculas(String err) {

        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }





}