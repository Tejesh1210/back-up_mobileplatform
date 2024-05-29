package com.example.myappdemo1;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class RegistrationActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle registration process
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // You can save the registration details in a database or perform any other action here

                // Navigate to the login page
                startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
                finish(); // Close this activity
            }
        });
    }
}