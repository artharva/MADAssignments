package com.example.explicitresume;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOpenResume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenResume = findViewById(R.id.btnOpenResume);

        btnOpenResume.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, ResumeActivity.class);
            startActivity(intent);

        });
    }
}