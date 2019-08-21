package com.ivan.mysubmissionone.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ivan.mysubmissionone.R;
import com.ivan.mysubmissionone.model.Movie;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Movie> mMovies;
    String text = "";

    public MovieAdapter(Context mContext) {
        this.mContext = mContext;
        this.mMovies = new ArrayList<>();
    }

    public void setmMovies(ArrayList<Movie> mMovies) {
        this.mMovies = mMovies;
    }

    @Override
    public int getCount() {
        return mMovies.size();
    }

    @Override
    public Object getItem(int i) {
        return mMovies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_movie, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Movie hero = (Movie) getItem(i);
        viewHolder.bind(hero);
        return view;
    }

    public class ViewHolder {
        @BindView(R.id.tv_description)
        TextView tvDesc;
        @BindView(R.id.tv_Title)
        TextView tvTitle;
        @BindView(R.id.iv_movie)
        ImageView ivMovie;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }

        void bind(Movie movie) {
            text = movie.getOverview();
            if (text.length() > 20) {
                text = text.substring(0, 50) + "...";
                tvDesc.setText(Html.fromHtml(text + "<font color='red'> <u>Lihat semua</u></font>"));

            }
            tvTitle.setText(movie.getTitle());
            Glide.with(mContext)
                    .load(movie.getImage())
                    .into(ivMovie);
        }
    }
}