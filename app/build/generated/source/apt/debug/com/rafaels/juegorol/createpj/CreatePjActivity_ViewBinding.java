// Generated code from Butter Knife. Do not modify!
package com.rafaels.juegorol.createpj;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
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

    target.fragmentRoot = Utils.findRequiredViewAsType(source, R.id.fragment_root, "field 'fragmentRoot'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreatePjActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fragmentRoot = null;
  }
}
