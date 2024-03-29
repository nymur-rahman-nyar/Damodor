package com.example.damodor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MailUsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mail_us_page)
        setTitle("Contact Us")

        //setting up the back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val button = findViewById<Button>(R.id.btn_callUs)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@damodor.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Customer Query")
            intent.putExtra(Intent.EXTRA_TEXT, "Please mention the product/service code which you are interested in along with your contact information so our representative can assist you properly")
            intent.type = "message/rfc822"
            // startActivity(Intent.createChooser(intent, "Send mail"))
            try {
                //start email intent
                startActivity(Intent.createChooser(intent, "Choose Email Client..."))
            }
            catch (e: Exception){
                //if any thing goes wrong for example no email client application or any exception
                //get and show exception message
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }


    }

    //code to end the activity after the back button is pressed.
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