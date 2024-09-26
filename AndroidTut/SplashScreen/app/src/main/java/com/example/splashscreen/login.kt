package com.example.spalshscreen

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.splashscreen.R
import com.google.android.material.textfield.TextInputEditText

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val loginButton: Button = findViewById(R.id.button)
        val username: TextInputEditText = findViewById(R.id.username)
        val password: TextInputEditText = findViewById(R.id.password)

        loginButton.setOnClickListener {
            if (username.text.toString().isNotEmpty() && password.text.toString().isNotEmpty())
            { Toast.makeText(this, "Login succesfyll", Toast.LENGTH_SHORT).show() }
            else {
                Toast.makeText(this, "Please fill in the login details", Toast.LENGTH_SHORT).show()
            }
        }
    }

}