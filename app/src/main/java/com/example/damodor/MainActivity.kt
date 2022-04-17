package com.example.damodor

import android.content.Intent
import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setting the logo in the action bar programmatically

        supportActionBar?.apply {
            title = "Damodor"
            setDisplayShowHomeEnabled(true)
            setDisplayUseLogoEnabled(true)
            setLogo(R.drawable.ic_damodor_logo)  //here we must add the resouce directory of the logo
        }

        //---end of Setting the logo in the action bar programmatically---


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

        //---end of connection of CardView to the activities---






    }

    //Adding the action bar menu item (outside oncreate fun)
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        return super.onCreateOptionsMenu(menu)
    }
    //---end of Adding the action bar menu item (outside oncreate fun)---


    //Connecting the menu item with the AboutUs activity
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when(item.itemId){
           R.id.mi_aboutUs ->{
               val intent = Intent(this, AboutUs::class.java)
               startActivity(intent)
           }
       }

        return super.onOptionsItemSelected(item)
    }
    //---Connecting the menu item with the AboutUs activity---

}