package com.example.kotapp


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var viewTextButton: Button
    private lateinit var clearButton: Button
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Link layout file

        editText = findViewById(R.id.text_input)
        viewTextButton = findViewById(R.id.view_text_button)
        clearButton = findViewById(R.id.clear_button)
        saveButton = findViewById(R.id.save_button)

        viewTextButton.setOnClickListener {
            val enteredText = editText.text.toString()
            Toast.makeText(this, enteredText, Toast.LENGTH_SHORT).show() // Display using Toast
        }

        clearButton.setOnClickListener {
            editText.text.clear() // Clear the EditText
        }

        // Implement save functionality based on your app's requirements (e.g., saving to a file, database)
        saveButton.setOnClickListener {
            // Your save logic here (e.g., save enteredText to a file or database)
            Toast.makeText(this, "Text saved (placeholder for actual saving)", Toast.LENGTH_SHORT).show()
        }
    }
}
