package com.example.homecontroller

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lightControlButton: Button = findViewById(R.id.btn_light_control)
        val thermostatControlButton: Button = findViewById(R.id.btn_thermostat_control)
        val securityControlButton: Button = findViewById(R.id.btn_security_control)

        lightControlButton.setOnClickListener {
            Toast.makeText(this, "Light Control Clicked", Toast.LENGTH_SHORT).show()
        }

        thermostatControlButton.setOnClickListener {
            Toast.makeText(this, "Thermostat Control Clicked", Toast.LENGTH_SHORT).show()
        }

        securityControlButton.setOnClickListener {
            Toast.makeText(this, "Security Control Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
