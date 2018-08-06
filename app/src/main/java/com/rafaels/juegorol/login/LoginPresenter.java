package com.rafaels.juegorol.login;

import android.util.Log;

public class LoginPresenter implements Contract.LoginPresenter {

    private LoginView loginView;
    private LoginModel loginModel;

    public LoginPresenter(LoginView view){
        loginView = view;
        loginModel = new LoginModel(this);
    }

    @Override
    public void onClickLoginPresenter(String email, String password) {
        Log.d("testeo0", email.length()+"----"+email);
        Log.d("testeo1", password.length()+"----"+password);
        if((email.length() > 3) && (password.length() > 3)){
            loginView.onLoginSuccess();
        } else{
            loginView.onLoginFailed();
        }
    }


}
