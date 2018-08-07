package com.rafaels.juegorol.menu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rafaels.juegorol.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MenuView extends Fragment implements ContractMenu.MenuView {

    public static final String TAG = "MenuView";

    @BindView(R.id.menu_start)
    Button start;
    @BindView(R.id.menu_list_pj)
    Button listPj;
    @BindView(R.id.menu_create_pj)
    Button createPj;
    @BindView(R.id.menu_bestiario)
    Button bestiario;

    private MenuPresenter menuPresenter;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        menuPresenter = new MenuPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.view_menu, container, false);
        ButterKnife.bind(this, view);

        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
        // Añade aqui tu codigo el cual se ejecutara despues de onCreateView().
        createPj.setOnClickListener(viewCreatePj -> menuPresenter.onClickCreatePjPresenter(getActivity()));
    }

    @Override
    public void onPause(){
        super.onPause();
    }

}
