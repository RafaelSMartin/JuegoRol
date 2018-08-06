package com.rafaels.juegorol.login;

public class LoginModel implements Contract.LoginModel {

    private LoginPresenter loginPresenter;

    public LoginModel(LoginPresenter presenter){
        this.loginPresenter = presenter;
    }

}
