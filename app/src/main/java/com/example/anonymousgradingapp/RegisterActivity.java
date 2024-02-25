package com.example.anonymousgradingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText nameEditText, usernameEditText, passwordEditText;
    private Button registerButton;
    // textview loginLink
    private TextView loginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize components
        nameEditText = findViewById(R.id.registerName);
        usernameEditText = findViewById(R.id.registerUsername);
        passwordEditText = findViewById(R.id.registerPassword);
        registerButton = findViewById(R.id.registerButton);
        loginLink = findViewById(R.id.loginLink);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String name = nameEditText.getText().toString();
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // if name, username, or password is empty, display error message
                if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // TODO: Implement validation and registration logic
                registerUser(name, username, password);
            }
        });

        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to login activity
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void registerUser(String name, String username, String password) {
        // registration logic here
        // Temp success message, and go back to login
        Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show();
        // TODO: Go back to login activity
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);


    }
}
