// Generated code from Butter Knife. Do not modify!
package com.rafaels.juegorol.createpj;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.BottomNavigationView;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.rafaels.juegorol.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CreatePjActivity_ViewBinding implements Unbinder {
  private CreatePjActivity target;

  @UiThread
  public CreatePjActivity_ViewBinding(CreatePjActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CreatePjActivity_ViewBinding(CreatePjActivity target, View source) {
    this.target = target;

    target.fragmentCreatePj = Utils.findRequiredViewAsType(source, R.id.fragment_create_pj, "field 'fragmentCreatePj'", RelativeLayout.class);
    target.bottomNavigationView = Utils.findRequiredViewAsType(source, R.id.bottom_navigation_view, "field 'bottomNavigationView'", BottomNavigationView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreatePjActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fragmentCreatePj = null;
    target.bottomNavigationView = null;
  }
}
