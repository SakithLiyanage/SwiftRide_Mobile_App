package com.example.swiftridemobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val update_prof: Button = findViewById(R.id.update_prof_btn)
        update_prof.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, editProfile::class.java)
            startActivity(intent)
        }

        // Get reference to the ImageView (logout)
        val logout: ImageView = findViewById(R.id.logout)


        logout.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
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
        // Get reference to the ImageView (home)
        val homenavigate: ImageView = findViewById(R.id.home)


        homenavigate.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }

}