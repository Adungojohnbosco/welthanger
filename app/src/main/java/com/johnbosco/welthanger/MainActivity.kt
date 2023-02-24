package com.johnbosco.welthanger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    val SPLASH_TIME_OUT=4000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val r=Intent(this,homewelt::class.java)
            startActivity(r)
            finish()
        },SPLASH_TIME_OUT)
    }
}