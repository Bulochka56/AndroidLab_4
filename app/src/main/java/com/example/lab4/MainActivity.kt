package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var button14: Button
    private lateinit var button16: Button
    private lateinit var button18: Button
    private lateinit var button20: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.textView)
        button14 = findViewById(R.id.button14sp)
        button16 = findViewById(R.id.button16sp)
        button18 = findViewById(R.id.button18sp)
        button20 = findViewById(R.id.button20sp)
        val size = 14

        button14.setOnClickListener(View.OnClickListener {
            text.setTextSize(14f)
        })
        button16.setOnClickListener(View.OnClickListener {
            text.setTextSize(16f)
        })
        button18.setOnClickListener(View.OnClickListener {
            text.setTextSize(18f)
        })
        button20.setOnClickListener(View.OnClickListener {
            text.setTextSize(20f)

        })
    }
}