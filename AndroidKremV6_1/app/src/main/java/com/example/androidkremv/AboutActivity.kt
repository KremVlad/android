package com.example.androidkremv

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle

class AboutActivity : Activity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about)
    }
}