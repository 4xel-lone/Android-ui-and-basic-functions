package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Button btnSignUp, btnAlreadyHaveAccount;
    EditText usernameInput, emailInput, passwordInput, confirmPasswordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        // Match correct XML IDs
        usernameInput = findViewById(R.id.editTextEmail2);       // Username
        emailInput = findViewById(R.id.editTextEmail);           // Email
        passwordInput = findViewById(R.id.editTextTextPassword9); // Password
        confirmPasswordInput = findViewById(R.id.editTextTextPassword6); // Confirm Password

        btnSignUp = findViewById(R.id.button4);
        btnAlreadyHaveAccount = findViewById(R.id.button5);

        if (btnSignUp != null) {
            btnSignUp.setOnClickListener(v -> {
                String username = usernameInput.getText().toString().trim();
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();
                String confirmPassword = confirmPasswordInput.getText().toString().trim();

                if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "❌ All fields are required.", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(RegisterActivity.this, "❌ Passwords do not match.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "✅ Account created successfully!", Toast.LENGTH_SHORT).show();

                    // Go back to login
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }

        if (btnAlreadyHaveAccount != null) {
            btnAlreadyHaveAccount.setOnClickListener(v -> {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            });
        }
    }
}


