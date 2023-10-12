package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class TweenAnimationLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tween_animation_layout)
        val img: ImageView = findViewById(R.id.imageView2)
        img.setImageResource(R.drawable.autumn);
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.tween)
        img.startAnimation(animation)
    }
}