package com.sallar.mymvploginexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sallar.mymvploginexample.presenter.LoginPresenter;
import com.sallar.mymvploginexample.view.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {

    EditText etEmail , etPass;
    String email , pass;
    Button submit;
    LoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);

        submit = findViewById(R.id.btnSubmit);

        loginPresenter = new LoginPresenter(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = etEmail.getText().toString();
                pass = etPass.getText().toString();

                loginPresenter.onLogin(email , pass);
            }
        });

    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
