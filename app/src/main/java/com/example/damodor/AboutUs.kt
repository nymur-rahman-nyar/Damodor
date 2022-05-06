package com.example.damodor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        setTitle("Who We Are")


    }
}