// Generated code from Butter Knife. Do not modify!
package com.dicoding.ivan.mycatalog.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dicoding.ivan.mycatalog.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchMovieActivity_ViewBinding implements Unbinder {
  private SearchMovieActivity target;

  @UiThread
  public SearchMovieActivity_ViewBinding(SearchMovieActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchMovieActivity_ViewBinding(SearchMovieActivity target, View source) {
    this.target = target;

    target.rvMovies = Utils.findRequiredViewAsType(source, R.id.rv_movies, "field 'rvMovies'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchMovieActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvMovies = null;
  }
}
