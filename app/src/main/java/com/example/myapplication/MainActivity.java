package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton connectButton = findViewById(R.id.button);

        if (connectButton != null) {
            connectButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Optional: show toast
                    Toast.makeText(MainActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();

                    // Navigate to LoginActivity
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            });
        } else {
            Toast.makeText(this, "Button not found!", Toast.LENGTH_SHORT).show();
        }
    }
}
