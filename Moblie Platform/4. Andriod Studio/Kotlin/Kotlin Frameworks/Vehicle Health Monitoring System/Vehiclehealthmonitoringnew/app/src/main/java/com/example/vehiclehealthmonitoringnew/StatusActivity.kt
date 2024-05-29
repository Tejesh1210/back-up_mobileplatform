package com.example.vehiclehealthmonitoringnew

import android.os.AsyncTask
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

class StatusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        // Fetch vehicle status when activity is created
        fetchVehicleStatus()
    }

    private fun fetchVehicleStatus() {
        // Perform HTTP GET request to your backend server
        AsyncTask.execute {
            val url = URL("https://andriod-1.onrender.com/status")
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"

            val inputStream = connection.inputStream
            val response = inputStream.bufferedReader().use { it.readText() }

            // Parse response JSON and update UI accordingly
            val status = JSONObject(response).getString("status")

            runOnUiThread {
                // Update UI with status information
                val textViewStatusInfo: TextView = findViewById(R.id.textViewStatusInfo)
                textViewStatusInfo.text = "Status: $status"
            }

            connection.disconnect()
        }
    }
}
