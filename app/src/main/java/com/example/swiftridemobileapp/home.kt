package com.example.swiftridemobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val findbusbtn: Button = findViewById(R.id.btnFindBus)
        findbusbtn.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, findbus::class.java)
            startActivity(intent)
        }
        // Get reference to the ImageView (tickets)
        val ticketnavigate: ImageView = findViewById(R.id.tickets)


        ticketnavigate.setOnClickListener {
            val intent = Intent(this, mytickets::class.java)
            startActivity(intent)
        }
        // Get reference to the ImageView (wallet)
        val walletnavigate: ImageView = findViewById(R.id.wallet)


        walletnavigate.setOnClickListener {
            val intent = Intent(this, wallet::class.java)
            startActivity(intent)
        }
        // Get reference to the ImageView (tickets)
        val profilenavigate: ImageView = findViewById(R.id.profile)


        profilenavigate.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        val viewticket: Button = findViewById(R.id.btnViewTicket)
        viewticket.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, view_ticket::class.java)
            startActivity(intent)
        }
    }
}