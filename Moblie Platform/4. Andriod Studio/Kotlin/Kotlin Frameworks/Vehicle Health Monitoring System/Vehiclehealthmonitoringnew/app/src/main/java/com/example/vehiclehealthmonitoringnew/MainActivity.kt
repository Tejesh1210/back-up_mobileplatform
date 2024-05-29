package com.example.vehiclehealthmonitoringnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerButton: Button = findViewById(R.id.registerButton)
        val statusButton: Button = findViewById(R.id.statusButton)

        registerButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        statusButton.setOnClickListener {
            startActivity(Intent(this, StatusActivity::class.java))
        }
    }
}
