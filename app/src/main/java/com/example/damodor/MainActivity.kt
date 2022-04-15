package com.example.damodor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Creating the connection between the card view and the activities

        val mrMckenicCard = findViewById<CardView>(R.id.cv_mrMckenic)
        mrMckenicCard.setOnClickListener {
            val intent = Intent(this, MrMckenicProductSearchPage::class.java)
            startActivity(intent)
        }

        val germKillerCard = findViewById<CardView>(R.id.cv_gkGermKiller)
        germKillerCard.setOnClickListener {
            val intent = Intent(this,  GermKillerProductSearchPage::class.java)
            startActivity(intent)
        }

        val engineeringCard = findViewById<CardView>(R.id.cv_engineerig)
        engineeringCard.setOnClickListener {
            val intent = Intent(this, EngineeringProductSearchPage::class.java)
            startActivity(intent)
        }


    }


}