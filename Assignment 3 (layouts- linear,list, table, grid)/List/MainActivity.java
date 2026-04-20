package com.example.listlayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        listView = findViewById(R.id.listView);

        // Data for list
        String[] items = {
                "C Programming",
                "C++",
                "Java",
                "Android",
                "Python",
                "Web Development"
        };

        // Adapter
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        items);

        listView.setAdapter(adapter);
    }
}