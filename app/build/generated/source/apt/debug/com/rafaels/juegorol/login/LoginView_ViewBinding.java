// Generated code from Butter Knife. Do not modify!
package com.rafaels.juegorol.login;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.rafaels.juegorol.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginView_ViewBinding implements Unbinder {
  private LoginView target;

  @UiThread
  public LoginView_ViewBinding(LoginView target, View source) {
    this.target = target;

    target.emailText = Utils.findRequiredViewAsType(source, R.id.input_email, "field 'emailText'", EditText.class);
    target.passwordText = Utils.findRequiredViewAsType(source, R.id.input_password, "field 'passwordText'", EditText.class);
    target.loginButton = Utils.findRequiredViewAsType(source, R.id.btn_login, "field 'loginButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emailText = null;
    target.passwordText = null;
    target.loginButton = null;
  }
}
