package com.example.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frameAnimationButton: Button = findViewById(R.id.button)
        val tweenAnimationButton: Button = findViewById(R.id.button2)

        frameAnimationButton.setOnClickListener {
            startActivity(Intent(this, FrameAnimationLayout::class.java))
        }

        tweenAnimationButton.setOnClickListener {
            startActivity(Intent(this, TweenAnimationLayout::class.java))
        }

    }
}