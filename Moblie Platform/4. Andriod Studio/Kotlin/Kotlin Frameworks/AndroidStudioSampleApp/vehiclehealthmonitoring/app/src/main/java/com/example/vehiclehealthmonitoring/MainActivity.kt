package com.example.vehiclehealthmonitoring

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val engineButton: Button = findViewById(R.id.engineButton)
        val batteryButton: Button = findViewById(R.id.batteryButton)
        val tirePressureButton: Button = findViewById(R.id.tirePressureButton)
        val oilLevelButton: Button = findViewById(R.id.oilLevelButton)

        engineButton.setOnClickListener {
            Toast.makeText(this, "Engine Status Clicked", Toast.LENGTH_SHORT).show()
            // Add functionality to check engine status
        }

        batteryButton.setOnClickListener {
            Toast.makeText(this, "Battery Health Clicked", Toast.LENGTH_SHORT).show()
            // Add functionality to check battery health
        }

        tirePressureButton.setOnClickListener {
            Toast.makeText(this, "Tire Pressure Clicked", Toast.LENGTH_SHORT).show()
            // Add functionality to check tire pressure
        }

        oilLevelButton.setOnClickListener {
            Toast.makeText(this, "Oil Level Clicked", Toast.LENGTH_SHORT).show()
            // Add functionality to check oil level
        }
    }
}
