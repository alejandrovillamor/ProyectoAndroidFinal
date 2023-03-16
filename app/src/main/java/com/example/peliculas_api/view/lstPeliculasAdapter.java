package com.example.peliculas_api.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.peliculas_api.R;
import com.example.peliculas_api.entities.Peliculas;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class lstPeliculasAdapter extends RecyclerView.Adapter<lstPeliculasAdapter.ViewHolder> {

    private ArrayList<Peliculas> datospeliculas;
    private Context context;

    public lstPeliculasAdapter(ArrayList<Peliculas> datospeliculas ,Context context) {
        this.datospeliculas = datospeliculas;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.visual_pelicula,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Peliculas pelicula = datospeliculas.get(position);

        Picasso.get().load(pelicula.getImagen()).into(holder.idImgPelicula);
    }

    @Override
    public int getItemCount() {
        return datospeliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView idImgPelicula;

        public ViewHolder(View itemView) {
            super(itemView);

            idImgPelicula = (ImageView) itemView.findViewById(R.id.idImgPeli);

        }
    }
}
