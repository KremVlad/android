package com.example.androidkremv

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leftBtn: Button = findViewById(R.id.leftBtn)
        val enterBtn: Button = findViewById(R.id.enterBtn)

        val edit_address: TextView = findViewById(R.id.edit_address)
        val edit_gift: TextView = findViewById(R.id.edit_gift)
        val edit_avtor: TextView = findViewById(R.id.edit_avtor)

        leftBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }
        enterBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            // в ключ username пихаем текст из первого текстового поля
            intent.putExtra("username", edit_address.text.toString())
            // в ключ avtor пихаем текст из второго текстового поля
            intent.putExtra("avtor", edit_avtor.text.toString())
            // в ключ gift пихаем текст из третьего текстового поля
            intent.putExtra("gift", edit_gift.text.toString())
            startActivity(intent)
        }
    }
}