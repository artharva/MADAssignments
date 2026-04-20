package com.example.departmentproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {

            String user = username.getText().toString();
            String pass = password.getText().toString();

            if(user.equals("Shubham") && pass.equals("Shubham@123")){

                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intent);

            }else{
                Toast.makeText(this,"Invalid Login",Toast.LENGTH_SHORT).show();
            }
        });
    }
}