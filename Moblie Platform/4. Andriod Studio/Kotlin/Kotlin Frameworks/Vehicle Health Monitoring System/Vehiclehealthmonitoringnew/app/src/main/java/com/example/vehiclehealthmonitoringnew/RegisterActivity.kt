package com.example.vehiclehealthmonitoringnew

import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import android.os.AsyncTask
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject

class RegisterActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextRegistrationNo: EditText
    private lateinit var editTextChassisNo: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialize EditText fields
        editTextName = findViewById(R.id.editTextName)
        editTextRegistrationNo = findViewById(R.id.editTextRegistrationNo)
        editTextChassisNo = findViewById(R.id.editTextChassisNo)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)

        val registerButton: Button = findViewById(R.id.registerButton)
        registerButton.setOnClickListener {
            // Perform registration when button is clicked
            performRegistration()
        }
    }

    private fun performRegistration() {
        val name = editTextName.text.toString()
        val registrationNo = editTextRegistrationNo.text.toString()
        val chassisNo = editTextChassisNo.text.toString()
        val email = editTextEmail.text.toString()
        val password = editTextPassword.text.toString()

        // Create a JSON object with user data
        val jsonObject = JSONObject().apply {
            put("name", name)
            put("registration_no", registrationNo)
            put("chassis_no", chassisNo)
            put("email", email)
            put("password", password)
        }

        // Perform HTTP POST request to your backend server
        AsyncTask.execute {
            val url = URL("https://localhost:3001/api/register")
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "POST"
            connection.setRequestProperty("Content-Type", "application/json")
            connection.doOutput = true

            val outputStream = connection.outputStream
            outputStream.write(jsonObject.toString().toByteArray())
            outputStream.flush()
            outputStream.close()

            val responseCode = connection.responseCode
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Registration successful
                runOnUiThread {
                    Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()
                    // Navigate to next activity or perform any other action
                }
            } else {
                // Registration failed
                runOnUiThread {
                    Toast.makeText(this, "Registration failed", Toast.LENGTH_SHORT).show()
                }
            }

            connection.disconnect()
        }
    }
}
