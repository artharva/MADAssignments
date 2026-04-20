package com.example.departmentproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DepartmentInfoActivity extends AppCompatActivity {

    TextView title, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_info);

        title = findViewById(R.id.title);
        info = findViewById(R.id.info);

        String dept = getIntent().getStringExtra("deptName");

        title.setText(dept);

        if ("Java".equals(dept)) {
            info.setText("Focuses on programming, AI, and software engineering.");
        }
        else if ("Python".equals(dept)) {
            info.setText("The Python Programming lab is used to perform practicals of Compiler Construction, BDA, Operating System, Database Engineering and Compiler Construction. Software installed includes Ubuntu OS, PyCharm editor, Atom editor, Brackets editor, GCC, g++ and Open JDK.");
        }
        else if ("R Programming".equals(dept)) {
            info.setText("The R Programming lab is used to perform practicals of Data Structures, Web Technology, Java Programming and CNN.");
        }
        else if ("Mobile App Development".equals(dept)) {
            info.setText("Mobile App Development lab includes Android Studio and tools for building Android applications.");
        }
        else if ("Web Development".equals(dept)) {
            info.setText("Web Technology lab uses XAMPP server, Wampserver, Atom editor, Brackets editor and other tools.");
        }
        else if ("Database Management".equals(dept)) {
            info.setText("Database lab includes MySQL, MongoDB and tools used for database engineering.");
        }
        else if ("System Programming".equals(dept)) {
            info.setText("Laboratory for system programming and low-level software development.");
        }
        else if ("Research".equals(dept)) {
            info.setText("Research Lab supports project development and advanced experimentation.");
        }
        else if ("Project".equals(dept)) {
            info.setText("Project lab supports final year project development with multiple programming tools.");
        }
        else if ("Project".equals(dept)) {
            info.setText("Project lab supports final year project development with multiple programming tools.");
        }
        else if ("Project".equals(dept)) {
            info.setText("Project lab supports final year project development with multiple programming tools.");
        }

    }
}