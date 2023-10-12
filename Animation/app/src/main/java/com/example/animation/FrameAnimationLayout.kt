package com.example.animation

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FrameAnimationLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_animation_layout)
        val img: ImageView = findViewById(R.id.imageView)
        val frameAnimation = img.drawable as AnimationDrawable
        frameAnimation.callback = img
        frameAnimation.setVisible(true, true)
        frameAnimation.start()

    }
}