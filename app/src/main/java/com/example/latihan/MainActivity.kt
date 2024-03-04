package com.example.latihan

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_name)
        textView.text = "Safitri Kurnia Suardini\nUniversitas Pembangunan Nasional Veteran Yogyakarta"
        textView.textSize = 24f
        textView.setTextColor(Color.parseColor("#FF0000"))
    }
}