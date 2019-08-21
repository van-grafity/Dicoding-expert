// Generated code from Butter Knife. Do not modify!
package com.dicoding.ivan.mycatalog.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import com.dicoding.ivan.mycatalog.R;
import java.lang.Deprecated;
import java.lang.Override;

public class MyPreferenceFragment_ViewBinding implements Unbinder {
  /**
   * @deprecated Use {@link #MyPreferenceFragment_ViewBinding(MyPreferenceFragment, Context)} for direct creation.
   *     Only present for runtime invocation through {@code ButterKnife.bind()}.
   */
  @Deprecated
  @UiThread
  public MyPreferenceFragment_ViewBinding(MyPreferenceFragment target, View source) {
    this(target, source.getContext());
  }

  @UiThread
  public MyPreferenceFragment_ViewBinding(MyPreferenceFragment target, Context context) {
    Resources res = context.getResources();
    target.setting_locale = res.getString(R.string.key_setting_locale);
  }

  @Override
  @CallSuper
  public void unbind() {
  }
}
