package com.example.button;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tvCount);
        Button btn = findViewById(R.id.btnClick);

        btn.setOnClickListener(v -> {
            count++;
            tv.setText("Count: " + count);
        });
    }
}