// Generated code from Butter Knife. Do not modify!
package com.dicoding.ivan.mycatalog.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dicoding.ivan.mycatalog.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailMovieActivity_ViewBinding implements Unbinder {
  private DetailMovieActivity target;

  @UiThread
  public DetailMovieActivity_ViewBinding(DetailMovieActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailMovieActivity_ViewBinding(DetailMovieActivity target, View source) {
    this.target = target;

    target.imageBackdrop = Utils.findRequiredViewAsType(source, R.id.image_backdrop, "field 'imageBackdrop'", ImageView.class);
    target.txtNamaMovie = Utils.findRequiredViewAsType(source, R.id.txt_nama_movie, "field 'txtNamaMovie'", TextView.class);
    target.txtTanggalMovie = Utils.findRequiredViewAsType(source, R.id.txt_tanggal_movie, "field 'txtTanggalMovie'", TextView.class);
    target.txtDeskripsiMovie = Utils.findRequiredViewAsType(source, R.id.txt_deskripsi_movie, "field 'txtDeskripsiMovie'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailMovieActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageBackdrop = null;
    target.txtNamaMovie = null;
    target.txtTanggalMovie = null;
    target.txtDeskripsiMovie = null;
  }
}
