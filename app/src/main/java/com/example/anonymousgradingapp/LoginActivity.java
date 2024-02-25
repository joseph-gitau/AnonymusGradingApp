package com.example.anonymousgradingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize components
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // TODO: Implement validation and login logic
                loginUser(username, password);
            }
        });
    }

    private void loginUser(String username, String password) {
        // login logic here
        // Temp success message, and go to home
        Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
        // TODO: Go to home activity
        Intent intent = new Intent(this, AddCourseActivity.class);
        startActivity(intent);
    }
}

