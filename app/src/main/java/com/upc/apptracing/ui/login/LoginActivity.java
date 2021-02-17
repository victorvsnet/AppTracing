package com.upc.apptracing.ui.login;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.upc.apptracing.MainActivity;
import com.upc.apptracing.R;
import com.upc.apptracing.dao.DAOConductor;
import com.upc.apptracing.entidades.Conductor;
import com.upc.apptracing.util.LoadDataBase;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;

    //Cargamos la informacion Inicial
    LoadDataBase loadDataBase;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginViewModel = new ViewModelProvider(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);

        loadDataBase = new LoadDataBase(this);

        final EditText usernameEditText = (EditText) findViewById(R.id.tv_usuario);
        final EditText passwordEditText = (EditText) findViewById(R.id.tv_contraseña);
        final Button loginButton = (Button) findViewById(R.id.btn_login);
        final ProgressBar loadingProgressBar = findViewById(R.id.loading);

        loginViewModel.getLoginFormState().observe(this, new Observer<LoginFormState>() {
            @Override
            public void onChanged(@Nullable LoginFormState loginFormState) {
                if (loginFormState == null) {
                    return;
                }
                loginButton.setEnabled(loginFormState.isDataValid());
                if (loginFormState.getUsernameError() != null) {
                    usernameEditText.setError(getString(loginFormState.getUsernameError()));
                }
                if (loginFormState.getPasswordError() != null) {
                    passwordEditText.setError(getString(loginFormState.getPasswordError()));
                }
            }
        });

        loginViewModel.getLoginResult().observe(this, new Observer<LoginResult>() {
            @Override
            public void onChanged(@Nullable LoginResult loginResult) {
                if (loginResult == null) {
                    return;
                }
                loadingProgressBar.setVisibility(View.GONE);
                if (loginResult.getError() != null) {
                    showLoginFailed(loginResult.getError());
                }
                if (loginResult.getSuccess() != null) {
                    updateUiWithUser(loginResult.getSuccess());
                }
                setResult(Activity.RESULT_OK);

                //Complete and destroy login activity once successful
                //finish();
            }
        });

        TextWatcher afterTextChangedListener = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // ignore
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // ignore
            }

            @Override
            public void afterTextChanged(Editable s) {
                loginViewModel.loginDataChanged(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
            }
        };
        usernameEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    loginViewModel.login(usernameEditText.getText().toString(),
                            passwordEditText.getText().toString());
                }
                return false;
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DAOConductor daoConductor = new DAOConductor(LoginActivity.this);
                String numeroDni = usernameEditText.getText().toString();
                String contrasenia = passwordEditText.getText().toString();

                daoConductor.openDB();
                Conductor loginConductor = daoConductor.buscarConductor(numeroDni, contrasenia);

                if (loginConductor != null) {
                    Log.i("==> LOGLogin", "ingreso con un elemento");

                    String loginName = loginConductor.getGls_nombre() + " " + loginConductor.getGls_apellido();
                    String welcome = "Bienvenido(a) " + loginName;

                    guardarPreferencia(loginName, numeroDni);

                    Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();

                    Intent miIntent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(miIntent);

                    finish();
                } else {
                    String message = "El DNI o la contraseña son incorrectas. Vuelva a intentar.";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                }
                /*

                Intent miIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(miIntent);
                loadingProgressBar.setVisibility(View.VISIBLE);
                loginViewModel.login(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
                finish();*/
            }
        });
    }

    public void guardarPreferencia(String nombreLogin, String num_dni) {
        SharedPreferences prefs = getSharedPreferences("PREFERENCIAS", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("loginName", nombreLogin);
        editor.putString("numDni", num_dni);
        editor.commit();
    }

    private void updateUiWithUser(LoggedInUserView model) {
        String welcome = getString(R.string.welcome) + model.getDisplayName();
        // TODO : initiate successful logged in experience
        Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();
    }

    private void showLoginFailed(@StringRes Integer errorString) {
        Toast.makeText(getApplicationContext(), errorString, Toast.LENGTH_SHORT).show();
    }
}