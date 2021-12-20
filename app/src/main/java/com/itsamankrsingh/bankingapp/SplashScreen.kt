package com.itsamankrsingh.bankingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.itsamankrsingh.bankingapp.databinding.SplashScreenBinding
import com.itsamankrsingh.bankingapp.ui.MainActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {


    private lateinit var binding : SplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        binding = DataBindingUtil.inflate<SplashScreenBinding>(this, R.layout.splash_screen) as SplashScreenBinding
        CoroutineScope(IO).launch {
            startEnterAnimation()
            delay(1500)
            var i = Intent(this@SplashScreen, MainActivity ::class.java)
            startActivity(i)
            finish()
        }
    }
    private fun startEnterAnimation() {
        binding.appName.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bottom))
        binding.logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bottom))
        binding.logo.setVisibility(View.VISIBLE)
        binding.designed.setVisibility(View.VISIBLE)
        binding.name.setVisibility(View.VISIBLE)
        binding.appName.setVisibility(View.VISIBLE)
        binding.appName.setVisibility(View.VISIBLE)
        binding.iView.setVisibility(View.VISIBLE)
    }
}