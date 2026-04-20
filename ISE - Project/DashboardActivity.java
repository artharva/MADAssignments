package com.example.departmentproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;

public class DashboardActivity extends AppCompatActivity {

    ImageView java, python, r_prog, mad, webdev, dbms, system_prog, research, project;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        java = findViewById(R.id.java);
        python = findViewById(R.id.python);
        r_prog = findViewById(R.id.r_prog);
        mad = findViewById(R.id.mad);
        webdev = findViewById(R.id.webdev);
        dbms = findViewById(R.id.dbms);
        system_prog = findViewById(R.id.system_prog);
        research = findViewById(R.id.research);
        project = findViewById(R.id.project);

        java.setOnClickListener(v -> openDepartment("Java"));
        python.setOnClickListener(v -> openDepartment("Python"));
        r_prog.setOnClickListener(v -> openDepartment("R Programming"));
        mad.setOnClickListener(v -> openDepartment("Mobile App Development"));
        webdev.setOnClickListener(v -> openDepartment("Web Development"));
        dbms.setOnClickListener(v -> openDepartment("Database Management"));
        system_prog.setOnClickListener(v -> openDepartment("System Programming"));
        research.setOnClickListener(v -> openDepartment("Research"));
        project.setOnClickListener(v -> openDepartment("Project"));
    }

    void openDepartment(String dept){

        Intent intent = new Intent(this, DepartmentInfoActivity.class);
        intent.putExtra("deptName", dept);
        startActivity(intent);
    }
}