package com.rafaels.juegorol.menu;

import android.app.Activity;

public class MenuPresenter implements ContractMenu.MenuPresenter {

    private MenuView menuView;
    private MenuModel menuModel;

    public MenuPresenter(MenuView menuView) {
        this.menuView = menuView;
        this.menuModel = new MenuModel(this);
    }


    @Override
    public void onClickStart() {
    }

    @Override
    public void onClickListPj() {
    }

    @Override
    public void onClickCreatePjPresenter(Activity startingActivity) {
//        Intent intent = new Intent(startingActivity, CreatePj.class);
//        startingActivity.startActivity(intent);
    }

    @Override
    public void onCLickBestiario() {
    }
}
