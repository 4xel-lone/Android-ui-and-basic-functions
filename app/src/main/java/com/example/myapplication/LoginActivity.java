package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button btnCreateAccount, btnSignIn;
    EditText emailInput, passwordInput;


    private final String correctEmail = "axledayne@gmail.com";
    private final String correctPassword = "axlewapo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        emailInput = findViewById(R.id.editTextEmail);
        passwordInput = findViewById(R.id.editTextPassword);
        btnSignIn = findViewById(R.id.button2);
        btnCreateAccount = findViewById(R.id.button3);


        if (btnSignIn != null) {
            btnSignIn.setOnClickListener(v -> {
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                if (email.equals(correctEmail) && password.equals(correctPassword)) {
                    // ✅ Correct login → go to Home
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "✅ Login Successful!", Toast.LENGTH_SHORT).show();
                } else {
                    // ❌ Wrong login → show error Toast
                    Toast.makeText(LoginActivity.this, "❌ Invalid email or password.", Toast.LENGTH_SHORT).show();
                }
            });
        }


        if (btnCreateAccount != null) {
            btnCreateAccount.setOnClickListener(v -> {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            });
        }
    }
}

