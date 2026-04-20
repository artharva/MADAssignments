package com.example.implicitintentdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnBrowser, btnDialer, btnMaps, btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBrowser = findViewById(R.id.btnBrowser);
        btnDialer = findViewById(R.id.btnDialer);
        btnMaps = findViewById(R.id.btnMaps);
        btnShare = findViewById(R.id.btnShare);

        // 🌐 Open Browser
        btnBrowser.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.com"));
            startActivity(intent);
        });

        // 📞 Open Dialer
        btnDialer.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:9876543210"));
            startActivity(intent);
        });

        // 📍 Open Google Maps
        btnMaps.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:28.6139,77.2090"));
            startActivity(intent);
        });

        // 📤 Share Text
        btnShare.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "Hello from my Implicit Intent App!");
            startActivity(Intent.createChooser(intent, "Share via"));
        });
    }
}