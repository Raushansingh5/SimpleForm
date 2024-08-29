package com.funyaani.simpleform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName = findViewById<EditText>(R.id.etName)
        val etId = findViewById<EditText>(R.id.etId)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        // Set click listener for the button
        btnSubmit.setOnClickListener {
            // Get input from EditText fields
            val name = etName.text.toString()
            val id = etId.text.toString()

            // Show toast with entered name and id
            Toast.makeText(this, "Name: $name, ID: $id", Toast.LENGTH_SHORT).show()
        }
    }
}

