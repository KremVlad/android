package com.example.androidkremv9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(applicationContext, "Чеширский кот", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val toast2 = Toast.makeText(applicationContext, R.string.cat_eating, Toast.LENGTH_SHORT)
            val toastContainer = toast2.view as LinearLayout
            val catImage = ImageView(this)
            catImage.setImageResource(R.drawable.hungry_kitty)
            toastContainer.addView(catImage, 0)
            toast2.show()
        }
    }//У меня на телефоне андроид 6, поэтому не могу сделать остальную часть задания
}