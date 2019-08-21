// Generated code from Butter Knife. Do not modify!
package com.dicoding.ivan.mycatalog.fragment;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dicoding.ivan.mycatalog.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NowPlayingFragment_ViewBinding implements Unbinder {
  private NowPlayingFragment target;

  @UiThread
  public NowPlayingFragment_ViewBinding(NowPlayingFragment target, View source) {
    this.target = target;

    target.rvMovies = Utils.findRequiredViewAsType(source, R.id.rv_movies, "field 'rvMovies'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NowPlayingFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvMovies = null;
  }
}
