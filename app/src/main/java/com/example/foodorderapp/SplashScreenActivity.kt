package com.example.foodorderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.foodorderapp.Activity.IntroActivity
import com.example.foodorderapp.Activity.MainActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val backgroundImage: ImageView = findViewById(R.id.SplashScreenImage)
        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.side_slide) //panggil animasi
        backgroundImage.startAnimation(slideAnimation)

        Handler().postDelayed({
            val intent = Intent(this, IntroActivity::class.java)

            startActivity(intent)
            finish()
        }, 3000)
    }
}