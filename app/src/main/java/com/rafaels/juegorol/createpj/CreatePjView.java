package com.rafaels.juegorol.createpj;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.rafaels.juegorol.R;
import com.rafaels.juegorol.createpj.characteristics.Characteristics;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CreatePjView extends Fragment implements ContractCreatePj.CreatePjView {
    public static final String TAG = "CreatePjView";

    private CreatePjPresenter createPjPresenter;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        createPjPresenter = new CreatePjPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.view_create_pj, container, false);
        ButterKnife.bind(this, view);


        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
        // Añade aqui tu codigo el cual se ejecutara despues de onCreateView().
    }

    @Override
    public void onPause(){
        super.onPause();
    }



}