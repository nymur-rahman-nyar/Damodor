package com.example.damodor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class CallUsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_us_page)

        //setting the back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        //setting the title
        setTitle("Contact Us")


        val button = findViewById<Button>(R.id.btn_callUs)
        button.setOnClickListener {
            val callIntent: Intent = Uri.parse("tel:+8801713419767").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent)
        }

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                //Write your logic here
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}