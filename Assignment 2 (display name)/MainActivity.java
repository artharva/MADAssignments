package com.example.namedisplayapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect XML with Java
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvResult = findViewById(R.id.tvResult);

        btnLogin.setOnClickListener(v -> {

            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();

            if(username.isEmpty() || password.isEmpty()){
                tvResult.setText("Please fill all details");
            }
            else{
                tvResult.setText("Welcome " + username + " 🎉");
            }

        });
    }
}