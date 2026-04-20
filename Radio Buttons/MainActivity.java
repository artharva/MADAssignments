package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(v -> {

            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == -1) {
                tvResult.setText("Please select a course");
            } else {
                RadioButton selectedRadio = findViewById(selectedId);
                tvResult.setText("Selected Course: " + selectedRadio.getText());
            }
        });
    }
}