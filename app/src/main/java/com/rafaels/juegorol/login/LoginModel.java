package com.rafaels.juegorol.login;

public class LoginModel implements ContractLogin.LoginModel {

    private LoginPresenter loginPresenter;

    public LoginModel(LoginPresenter loginPresenter){
        this.loginPresenter = loginPresenter;
    }

}
