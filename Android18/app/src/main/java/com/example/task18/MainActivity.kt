package com.example.task18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sunImageView: ImageView = findViewById(R.id.sun)
        val sunRiseAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.sun_rise)
        sunImageView.startAnimation(sunRiseAnimation)

        val clockImageView: ImageView = findViewById(R.id.clock)
        val clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn)
        clockImageView.startAnimation(clockTurnAnimation)

        val hourImageView: ImageView = findViewById(R.id.hour_hand)
        val hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn)
        hourImageView.startAnimation(hourTurnAnimation)

    }
}