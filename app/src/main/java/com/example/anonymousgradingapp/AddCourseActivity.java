package com.example.anonymousgradingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddCourseActivity extends AppCompatActivity {

    private static final int PICK_CSV_FILE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);

        Button uploadRosterButton = findViewById(R.id.uploadRosterButton);
        uploadRosterButton.setOnClickListener(v -> {
            // TODO: Open file picker to select CSV file

            Toast.makeText(this, "File picker not implemented yet", Toast.LENGTH_SHORT).show();
        });

        Button viewCoursesButton = findViewById(R.id.viewCoursesButton);
        viewCoursesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Open activity to view courses
                Toast.makeText(AddCourseActivity.this, "View courses not implemented yet", Toast.LENGTH_SHORT).show();
            }
        });

        Button addExamButton = findViewById(R.id.addExamButton);
        addExamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCourseActivity.this, AddExamActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_CSV_FILE && resultCode == RESULT_OK && data != null) {
            // Handle the CSV file here
            Uri csvFileUri = data.getData();
            // TODO: Read and process the CSV file
        }
    }
}
