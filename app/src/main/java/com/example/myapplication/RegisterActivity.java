package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Button btnSignUp, btnAlreadyHaveAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register); // Must match your XML file

        // Initialize buttons
        btnSignUp = findViewById(R.id.button4); // Sign Up
        btnAlreadyHaveAccount = findViewById(R.id.button5); // Already have an account

        // Sign Up button: go to HomeActivity
        if (btnSignUp != null) {
            btnSignUp.setOnClickListener(v -> {
                Toast.makeText(RegisterActivity.this, "Sign Up Clicked!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
                startActivity(intent);
            });
        }

        // Already have an account button: go to LoginActivity
        if (btnAlreadyHaveAccount != null) {
            btnAlreadyHaveAccount.setOnClickListener(v -> {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            });
        }
    }
}
