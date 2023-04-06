package com.example.abdullah4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.btnRegister)
        button1.setOnClickListener {
            val intent = Intent(this, ActvRegister::class.java)
            startActivity(intent)
        }
        val button2: Button = findViewById(R.id.btnLogin)
        button2.setOnClickListener {
            val intent = Intent(this, Konten::class.java)
            startActivity(intent)
        }
    }

}