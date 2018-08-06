package com.rafaels.juegorol.login;

public interface Contract {

    interface LoginModel{
    }

    interface LoginPresenter{
        void onClickLoginPresenter(String email, String password);
    }

    interface LoginView{
        void onLoginSuccess();
        void onLoginFailed();
    }

}
