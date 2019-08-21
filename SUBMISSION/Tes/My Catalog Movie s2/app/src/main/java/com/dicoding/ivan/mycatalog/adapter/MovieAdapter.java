package com.dicoding.ivan.mycatalog.adapter;

import android.content.Context;
import android.content.Intent;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.ivan.mycatalog.R;
import com.dicoding.ivan.mycatalog.activity.DetailMovieActivity;
import com.dicoding.ivan.mycatalog.model.Movies;
import com.dicoding.ivan.mycatalog.utils.StringUtils;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private Context context;
    private List<Movies> listMovies;

    public MovieAdapter(Context context, List<Movies> listMovies){
        this.context = context;
        this.listMovies = listMovies;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_movie, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(layoutParams);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Movies movies = listMovies.get(position);
        Glide.with(context)
                .load("http://image.tmdb.org/t/p/w185"+movies.getPosterPath())
                .placeholder(R.drawable.no_image_icon)
                .into(holder.imageMovies);
        holder.txtNamaMovies.setText(movies.getTitle());
        holder.txtDeskripsiMovies.setText(movies.getOverview());
        holder.txtTanggalMovies.setText(StringUtils.dateConverter(movies.getReleaseDate()));
    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageMovies;
        private TextView txtNamaMovies, txtDeskripsiMovies, txtTanggalMovies;

        public ViewHolder(View itemView) {
            super(itemView);

            imageMovies = (ImageView) itemView.findViewById(R.id.image_movie);
            txtNamaMovies = (TextView) itemView.findViewById(R.id.txt_nama_movie);
            txtDeskripsiMovies = (TextView) itemView.findViewById(R.id.txt_deskripsi);
            txtTanggalMovies = (TextView) itemView.findViewById(R.id.txt_tanggal);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int mPosition = getLayoutPosition();
                    Movies movies = listMovies.get(mPosition);

                    Intent i = new Intent(context, DetailMovieActivity.class);
                    i.putExtra("title", movies.getTitle());
                    i.putExtra("backdrop", movies.getBackdropPath());
                    i.putExtra("overview", movies.getOverview());
                    i.putExtra("release_date", StringUtils.dateConverter(movies.getReleaseDate()));
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(i);
                }
            });
        }
    }

}
