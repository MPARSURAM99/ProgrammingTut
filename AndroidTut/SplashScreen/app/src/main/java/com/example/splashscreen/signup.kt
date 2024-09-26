package com.example.spalshscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.splashscreen.R
import com.google.android.material.textfield.TextInputEditText
class Signup : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val registerButton: Button = findViewById(R.id.button)
        val resetButton: Button = findViewById(R.id.button2)
        val username: TextInputEditText = findViewById(R.id.imgv)
        val password: TextInputEditText = findViewById(R.id.edt1)
        val email: TextInputEditText = findViewById(R.id.edt2)
        val contactNumber: TextInputEditText = findViewById(R.id.editTextText3)

        registerButton.setOnClickListener {
            if (username.text.toString().isEmpty() ||
                password.text.toString().isEmpty() ||
                email.text.toString().isEmpty() ||
                contactNumber.text.toString().isEmpty()
            ) {
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registered successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
                finish()
            }
        }

        resetButton.setOnClickListener {
            username.text?.clear()
            password.text?.clear()
            email.text?.clear()
            contactNumber.text?.clear()
        }
    }

}