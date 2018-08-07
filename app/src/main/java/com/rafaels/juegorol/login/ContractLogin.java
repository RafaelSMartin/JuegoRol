package com.rafaels.juegorol.login;

import android.app.Activity;

public interface ContractLogin {

    interface LoginModel{
    }

    interface LoginPresenter{
        void onClickLoginPresenter(String email, String password);
        void showMenuActivityPresenter(Activity startingActivity);
    }

    interface LoginView{
        void onLoginSuccess();
        void onLoginFailed();
    }

}
