package com.example.linearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnVertical, btnHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load main screen layout
        setContentView(R.layout.activity_main);

        // Link buttons with XML
        btnVertical = findViewById(R.id.btnVertical);
        btnHorizontal = findViewById(R.id.btnHorizontal);

        // Show Vertical LinearLayout
        btnVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.linear_vertical);
            }
        });

        // Show Horizontal LinearLayout
        btnHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.linear_horizontal);
            }
        });
    }
}