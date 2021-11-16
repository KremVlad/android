package com.example.androidkremv

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var mHelloTextView: TextView
    private var counterVorona: Int = 0
    private var counterCat: Int = 0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageButton: ImageButton = findViewById(R.id.imageButton)

        val editText: EditText = findViewById(R.id.editText)
        val textView: TextView = findViewById(R.id.textViewHello)
        mHelloTextView = textView

        val helloKittyBtn: Button = findViewById(R.id.helloKittyBtn)
        val countVoronBtn: Button = findViewById(R.id.countVoronBtn)
        val countCatBtn: Button = findViewById(R.id.countCatBtn)

        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                mHelloTextView.text = "Hello Kitty!";
            } else {
                mHelloTextView.text = "Привет, " + editText.text
            }
        }
        helloKittyBtn.setOnClickListener {
            textView.text = "Hello Kitty!"
        }

        countVoronBtn.setOnClickListener {
            counterVorona++
            textView.text = "Насчитали ворон: $counterVorona"
        }

        countCatBtn.setOnClickListener {
            counterCat++
            textView.text = "Насчитали кошачих: $counterCat"
        }
    }
}