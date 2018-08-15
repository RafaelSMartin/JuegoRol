package com.rafaels.juegorol.createpj.characteristics;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rafaels.juegorol.R;

import butterknife.ButterKnife;

public class Characteristics extends Fragment {
    public static final String TAG = "Characteristics";




    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.view_characteristics, container, false);
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
