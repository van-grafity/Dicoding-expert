package com.ivan.mysubmissionone.activity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.ivan.mysubmissionone.R;
import com.ivan.mysubmissionone.adapter.MovieAdapter;
import com.ivan.mysubmissionone.model.Movie;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.lv_movies)
    ListView lvMovies;
    @BindView(R.id.tv_toolbar)
    TextView tvToolbar;

    private String[] mItems_title;
    private String[] mItms_desc;
    private TypedArray mItems_image;
    private MovieAdapter mMovieAdapter;
    private ArrayList<Movie> mMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_item);
        tvToolbar.setText("Home");


        mMovieAdapter = new MovieAdapter(this);
        lvMovies.setAdapter(mMovieAdapter);
        prepare();
        addItems();
        lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_MOVIE, mMovies.get(position));
                startActivity(intent);
                Toast.makeText(MainActivity.this, mMovies.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addItems() {
        mMovies = new ArrayList<>();
        for (int i = 0; i < mItems_title.length; i++) {
            Movie movie = new Movie();
            movie.setImage(mItems_image.getResourceId(i, -1));
            movie.setTitle(mItems_title[i]);
            movie.setOverview(mItms_desc[i]);
            mMovies.add(movie);
        }
        mMovieAdapter.setmMovies(mMovies);
    }

    private void prepare() {
        mItems_title = getResources().getStringArray(R.array.items_title);
        mItms_desc = getResources().getStringArray(R.array.items_desc);
        mItems_image = getResources().obtainTypedArray(R.array.items_image);
    }
}
