package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class lstPeliculas extends AppCompatActivity {


   String texto;
   ImageView flecha;
   String Drama = "Drama";
   String Accion = "Accion";
   String Cinco = "Cinco";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lstpeliculas);

       Bundle miBundle = this.getIntent().getExtras();

       if(miBundle!=null){
           texto = miBundle.getString("Filtro");
           if(texto.equals(Drama)){
               Toast.makeText(this, "Peliculas de "+texto, Toast.LENGTH_SHORT).show();
           }
           if(texto.equals(Accion)){
               Toast.makeText(this,"Peliculas de "+texto, Toast.LENGTH_SHORT).show();
           }
           if(texto.equals(Cinco)){
               Toast.makeText(this, "Peliculas con una valoracion"+texto, Toast.LENGTH_SHORT).show();
           }



       }else {
           Toast.makeText(this, "El dato llego vacio", Toast.LENGTH_SHORT).show();
       }

        flecha = (ImageView) findViewById(R.id.idFlechalstPelis);

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
}