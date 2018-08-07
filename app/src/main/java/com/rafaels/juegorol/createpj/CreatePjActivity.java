package com.rafaels.juegorol.createpj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.rafaels.juegorol.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CreatePjActivity extends AppCompatActivity {
    @BindView(R.id.fragment_root)
    RelativeLayout fragmentRoot;

    private CreatePjView createPjView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        ButterKnife.bind(this);

        createPjView = (CreatePjView) getFragmentManager().findFragmentByTag(CreatePjView.TAG);

        if (createPjView == null) {
            createPjView = new CreatePjView();
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_root, createPjView, CreatePjView.TAG)
                    .commit();

        }
    }
}
