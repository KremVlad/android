package com.example.androidkremv

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.content.ContextCompat
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout: ConstraintLayout = findViewById(R.id.layout_root)
        val textView: TextView = findViewById(R.id.textView)
        val redButton: Button = findViewById(R.id.redBtn)
        val yellowButton: Button = findViewById(R.id.yellowBtn)
        val greenButton: Button = findViewById(R.id.greenBtn)

        redButton.setOnClickListener {
            textView.text = "Красный"
            rootLayout.setBackgroundColor(resources.getColor(R.color.red, null))
        }

        yellowButton.setOnClickListener {
            textView.setText(R.string.yellow)
            rootLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow))
        }

        greenButton.setOnClickListener {
            textView.text = resources.getText(R.string.green)
            rootLayout.setBackgroundColor(Color.GREEN)
        }
    }
}