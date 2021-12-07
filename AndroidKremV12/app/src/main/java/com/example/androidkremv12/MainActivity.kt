package com.example.androidkremv12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)

        // старый пример
        val popupMenu = androidx.appcompat.widget.PopupMenu(this, imageView)
        popupMenu.inflate(R.menu.popupmenu)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu1 -> {
                    textView.text = "Вы выбрали PopupMenu 1"
                    true
                }
                R.id.menu2 -> {
                    textView.text = "Вы выбрали PopupMenu 2"
                    true
                }
                R.id.menu3 -> {
                    textView.text = "Вы выбрали PopupMenu 3"
                    true
                }
                else -> false
            }
        }

        imageView.setOnClickListener {
            popupMenu.show()
        }


    }
}