package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button btnCreateAccount, btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login); // make sure login.xml exists

        // Initialize buttons
        btnSignIn = findViewById(R.id.button2);
        btnCreateAccount = findViewById(R.id.button3);

        // Safety check to avoid NullPointerException
        if (btnSignIn != null) {
            btnSignIn.setOnClickListener(v -> {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
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
