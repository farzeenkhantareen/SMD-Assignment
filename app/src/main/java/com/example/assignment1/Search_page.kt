package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Search_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.search_page)
val clear_button=findViewById<ImageView>(R.id.clear_button)
        clear_button.setOnClickListener {
            val Intent= Intent(this, Explore_page::class.java)
            startActivity(Intent)
           finish()
        }

    }
}