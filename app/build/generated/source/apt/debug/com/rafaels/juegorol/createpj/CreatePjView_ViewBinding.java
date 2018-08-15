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

public class CreatePjView_ViewBinding implements Unbinder {
  private CreatePjView target;

  @UiThread
  public CreatePjView_ViewBinding(CreatePjView target, View source) {
    this.target = target;

    target.frameContainer = Utils.findRequiredViewAsType(source, R.id.frameContainer, "field 'frameContainer'", RelativeLayout.class);
    target.bottomNavigationView = Utils.findRequiredViewAsType(source, R.id.bottom_navigation_view, "field 'bottomNavigationView'", BottomNavigationView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreatePjView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.frameContainer = null;
    target.bottomNavigationView = null;
  }
}
