// Generated code from Butter Knife. Do not modify!
package com.rafaels.juegorol.menu;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.rafaels.juegorol.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MenuView_ViewBinding implements Unbinder {
  private MenuView target;

  @UiThread
  public MenuView_ViewBinding(MenuView target, View source) {
    this.target = target;

    target.start = Utils.findRequiredViewAsType(source, R.id.menu_start, "field 'start'", Button.class);
    target.listPj = Utils.findRequiredViewAsType(source, R.id.menu_list_pj, "field 'listPj'", Button.class);
    target.createPj = Utils.findRequiredViewAsType(source, R.id.menu_create_pj, "field 'createPj'", Button.class);
    target.bestiario = Utils.findRequiredViewAsType(source, R.id.menu_bestiario, "field 'bestiario'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MenuView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.start = null;
    target.listPj = null;
    target.createPj = null;
    target.bestiario = null;
  }
}
