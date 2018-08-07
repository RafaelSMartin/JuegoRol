package com.rafaels.juegorol.menu;

import android.app.Activity;

public interface ContractMenu {

    interface MenuModel{
    }

    interface MenuPresenter{
        void onClickStart();
        void onClickListPj();
        void onClickCreatePjPresenter(Activity startingActivity);
        void onCLickBestiario();
    }

    interface MenuView{

    }
}
