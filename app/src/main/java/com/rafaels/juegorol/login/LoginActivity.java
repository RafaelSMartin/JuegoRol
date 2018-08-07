package com.rafaels.juegorol.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.rafaels.juegorol.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.fragment_root)
    RelativeLayout fragmentRoot;

    private LoginView loginView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        ButterKnife.bind(this);

        loginView = (LoginView) getFragmentManager().findFragmentByTag(LoginView.TAG);

        if (loginView == null) {
            loginView = new LoginView();
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_root, loginView, LoginView.TAG)
                    .commit();

        }
    }

}
