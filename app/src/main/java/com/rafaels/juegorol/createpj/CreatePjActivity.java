package com.rafaels.juegorol.createpj;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.rafaels.juegorol.R;
import com.rafaels.juegorol.createpj.characteristics.Characteristics;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CreatePjActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.fragment_root)
    RelativeLayout fragmentCreatePj;

    @BindView(R.id.bottom_navigation_view)
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_pj);
        ButterKnife.bind(this);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.nav_main);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_main:
                item.setChecked(true);
                launchMainCreatePj();
                break;
            case R.id.nav_atributos:
                item.setChecked(true);
                launchCharacteristics();
                break;
            default:

                break;
        }
        return false;
    }

    private void launchMainCreatePj(){
        CreatePjView createPjView = (CreatePjView) getFragmentManager().findFragmentByTag(CreatePjView.TAG);

        if (createPjView == null) {
            createPjView = new CreatePjView();
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_root, createPjView, CreatePjView.TAG)
                    .commit();
        }
    }

    private void launchCharacteristics(){
        Characteristics characteristics = (Characteristics) getFragmentManager().findFragmentByTag(Characteristics.TAG);

        if (characteristics == null) {
            characteristics = new Characteristics();
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_root, characteristics, Characteristics.TAG)
                    .commit();
        }
    }


}
