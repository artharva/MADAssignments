package com.example.progressactivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    Button btnStart;
    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(v -> {
            progress = 0;

            Handler handler = new Handler();

            new Thread(() -> {
                while (progress <= 100) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    handler.post(() -> progressBar.setProgress(progress));
                    progress += 10;
                }
            }).start();
        });
    }
}