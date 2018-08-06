package com.rafaels.juegorol.login;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rafaels.juegorol.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginView extends Fragment implements  Contract.LoginView{
    public static final String TAG = "LoginView";

    @BindView(R.id.input_email)
    EditText emailText;

    @BindView(R.id.input_password)
    EditText passwordText;

    @BindView(R.id.btn_login)
    Button loginButton;

    private LoginPresenter loginPresenter;

    private String password, email;
    private String token;

    /**
     *
     * El sistema lo llama cuando crea el fragmento.
     * debes inicializar componentes esenciales del fragmento que quieres conservar
     * cuando el fragmento se pause o se detenga y luego se reanude.
     *
     **/
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        loginPresenter = new LoginPresenter(this);
    }


    /**
     *
     * El sistema lo llama cuando el fragmento debe diseñar su interfaz de usuario por primera vez.
     * Para diseñar una IU para tu fragmento, debes devolver una View desde este método
     * que será la raíz del diseño de tu fragmento.
     * Puedes devolver nulo su el fragmento no proporciona una IU.
     *
     **/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.view_login, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);

        // Añade aqui tu codigo el cual se ejecutara despues de onCreateView().
        loginButton.setOnClickListener(view1 -> loginPresenter.onClickLoginPresenter(
                emailText.getText().toString(),
                passwordText.getText().toString()));

    }

    /**
     *
     * El sistema llama a este método como el primer indicador de que el usuario está abandonando
     * el fragmento (aunque no siempre significa que el fragmento se esté destruyendo).
     * Generalmente este es el momento en el que debes confirmar los cambios que deban conservarse
     * más allá de la sesión de usuario actual (porque es posible que el usuario no vuelva).
     *
     **/
    @Override
    public void onPause(){
        super.onPause();
    }


    @Override
    public void onLoginSuccess() {
        Toast.makeText(getActivity(), "LoginSuccess", Toast.LENGTH_SHORT).show();
        loginButton.setEnabled(true);
    }

    @Override
    public void onLoginFailed() {
        Toast.makeText(getActivity(), "LoginFalla", Toast.LENGTH_SHORT).show();
        loginButton.setEnabled(true);
    }
}
