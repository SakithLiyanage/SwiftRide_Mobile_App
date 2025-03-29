package com.example.swiftridemobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cancel_booking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cancel_booking)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cancel: Button = findViewById(R.id.cancel_proceed)
        cancel.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, mytickets::class.java)
            startActivity(intent)
        }
        val cancel_action: Button = findViewById(R.id.cancel_action)
        cancel_action.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, view_ticket::class.java)
            startActivity(intent)
        }

        val backnavigate: ImageView = findViewById(R.id.back_button)


        backnavigate.setOnClickListener {
            val intent = Intent(this, mytickets::class.java)
            startActivity(intent)
        }
    }
}