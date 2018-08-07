package com.rafaels.juegorol.login;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.util.Patterns;

import com.rafaels.juegorol.menu.MenuActivity;

public class LoginPresenter implements ContractLogin.LoginPresenter {

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

        if(email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches() ||
                password.isEmpty() || password.length() < 6 || password.length() > 16){
            loginView.onLoginFailed();
        } else{
            loginView.onLoginSuccess();
        }
    }

    @Override
    public void showMenuActivityPresenter(Activity startingActivity) {
        Intent intent = new Intent(startingActivity, MenuActivity.class);
        startingActivity.startActivity(intent);
    }


}
