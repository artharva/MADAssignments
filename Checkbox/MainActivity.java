package com.example.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cbReading, cbMusic, cbSports, cbTravel;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbReading = findViewById(R.id.cbReading);
        cbMusic = findViewById(R.id.cbMusic);
        cbSports = findViewById(R.id.cbSports);
        cbTravel = findViewById(R.id.cbTravel);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(v -> {

            String hobbies = "";

            if (cbReading.isChecked()) hobbies += "Reading ";
            if (cbMusic.isChecked()) hobbies += "Music ";
            if (cbSports.isChecked()) hobbies += "Sports ";
            if (cbTravel.isChecked()) hobbies += "Travel ";

            if (hobbies.isEmpty()) {
                tvResult.setText("No hobbies selected");
            } else {
                tvResult.setText("Selected Hobbies: " + hobbies);
            }
        });
    }
}