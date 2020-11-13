package com.webanimal.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val go : TextView = findViewById(R.id.go)
        go.setOnClickListener {
            var intent = Intent(this, MovieDetailsActivity::class.java)
            startActivity(intent)
        }

    }
}