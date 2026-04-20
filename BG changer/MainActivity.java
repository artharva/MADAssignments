package com.example.bgchanger;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mainLayout;
    Button btnChange;
    boolean isFirstImage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);
        btnChange = findViewById(R.id.btnChange);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstImage) {
                    mainLayout.setBackgroundResource(R.drawable.bg2);
                } else {
                    mainLayout.setBackgroundResource(R.drawable.bg1);
                }
                isFirstImage = !isFirstImage;
            }
        });
    }
}