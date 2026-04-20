package com.example.menu;

import android.os.Bundle;
import android.view.*;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Create Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // Handle Menu Clicks
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menu_home) {
            Toast.makeText(this, "Welcome to Home", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.menu_cart) {
            Toast.makeText(this, "Opening Cart 🛒", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.menu_settings) {
            Toast.makeText(this, "Opening Settings ⚙️", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.menu_logout) {
            Toast.makeText(this, "Logged Out", Toast.LENGTH_SHORT).show();
            finish();
        }

        return true;
    }
}
