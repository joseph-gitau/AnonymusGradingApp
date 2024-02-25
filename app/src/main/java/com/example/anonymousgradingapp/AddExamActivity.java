package com.example.anonymousgradingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class AddExamActivity extends AppCompatActivity {
    private EditText examDateEditText;
    private Button scanExamButton, addCourseButton, viewBarcodeButton, uploadRosterButton, viewCoursesButton, addExamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exam);

        examDateEditText = findViewById(R.id.examDateEditText);
        examDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(AddExamActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                // Note: Month is 0-based, just add 1 for current month
                                examDateEditText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                datePickerDialog.show();
            }
        });

        scanExamButton = findViewById(R.id.scanExamButton);
        scanExamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Open barcode scanner to scan exam
                Intent intent = new Intent(AddExamActivity.this, ScanExamActivity.class);
                startActivity(intent);
            }
        });

        addCourseButton = findViewById(R.id.addCourseButton);
        addCourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddExamActivity.this, AddCourseActivity.class);
                startActivity(intent);
            }
        });

        viewBarcodeButton = findViewById(R.id.viewBarcodeButton);
        viewBarcodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddExamActivity.this, BarcodeActivity.class);
                startActivity(intent);
            }
        });

        uploadRosterButton = findViewById(R.id.uploadRosterButton);
        uploadRosterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddExamActivity.this, AddCourseActivity.class);
                startActivity(intent);
            }
        });
    }
}