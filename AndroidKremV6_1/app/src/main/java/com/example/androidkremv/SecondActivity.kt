package com.example.androidkremv

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var user = "ЖЫвотное"
        var gift = "дырку от бублика"
        val textview_second_info: TextView = findViewById(R.id.textview_second_info)

        user = intent.getStringExtra("username").toString()
        gift = intent.getStringExtra("gift").toString()
        val avtor = intent.getStringExtra("avtor").toString()


        textview_second_info.text = "$user, вам передали $gift от $avtor"
    }
}