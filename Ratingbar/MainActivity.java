package com.example.ratingactivity;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            float rating = ratingBar.getRating();

            String message;

            if (rating <= 2) {
                message = "Bad Experience 😞";
            } else if (rating == 3) {
                message = "Average 😐";
            } else {
                message = "Great! 😊";
            }

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        });
    }
}
