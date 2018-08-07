package com.rafaels.juegorol.menu;

public class MenuModel implements ContractMenu.MenuModel {

    private MenuPresenter menuPresenter;

    public MenuModel(MenuPresenter menuPresenter) {
        this.menuPresenter = menuPresenter;
    }
}
