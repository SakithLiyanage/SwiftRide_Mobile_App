package com.example.swiftridemobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val signinbtn: Button = findViewById(R.id.btn_signin)
        signinbtn.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }
        val signupbtn: Button = findViewById(R.id.btn_signup)
        signupbtn.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }
}