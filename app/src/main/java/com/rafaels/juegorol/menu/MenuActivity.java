package com.rafaels.juegorol.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rafaels.juegorol.R;

import butterknife.ButterKnife;

public class MenuActivity extends AppCompatActivity {


    private MenuView menuView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        ButterKnife.bind(this);

        menuView = (MenuView) getFragmentManager().findFragmentByTag(MenuView.TAG);

        if (menuView == null) {
            menuView = new MenuView();
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_root, menuView, MenuView.TAG)
                    .commit();

        }
    }

}