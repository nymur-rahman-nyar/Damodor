package com.example.damodor


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.rajat.pdfviewer.PdfViewerActivity
import kotlin.random.Random

class ProductDescriptionPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_description_page)

        setTitle("")

        //setting up the back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        //creating default value for Image
        val defaultImage:Int = R.drawable.ic_default_image_product_photo


        //fetching data from other activity
        val productImage = intent.getIntExtra("EXTRA_IMAGE",defaultImage)
        val productTitle = intent.getStringExtra("EXTRA_TITLE")
        val productDescription = intent.getStringExtra("EXTRA_DESCRIPTION")
        val cataloguePath = intent.getStringExtra("EXTRA_CAT_PATH")
        val msdsPath = intent.getStringExtra("EXTRA_MSDS_PATH")
        val sdsPath = intent.getStringExtra("EXTRA_SDS_PATH")

        //getting the views which we want to change
        var productMainImageView = findViewById<ImageView>(R.id.iv_DesPageMainProductImage)
        var productTitleTextview = findViewById<TextView>(R.id.tv_DesPageProductTitle)
        var productDescriptionTextView = findViewById<TextView>(R.id.tv_DesPageProductDescription)
        var cardViewCatalogue = findViewById<CardView>(R.id.cv_DesPageCatalogueTrigger)
        var cardViewMsds = findViewById<CardView>(R.id.cv_DesPageMsdsTrigger)
        var cardViewSds = findViewById<CardView>(R.id.cv_DesPageSdsTrigger)
        var floatingButtonCall = findViewById<ImageButton>(R.id.imgBtn_DesPageCallUs)
        var floatingButtonMail = findViewById<ImageButton>(R.id.imgBtn_DesPageMailUs)
        var textViewDownloadableTitle = findViewById<TextView>(R.id.tv_desPageDocumentDownloadTitle)
        var textViewDownloadableNote = findViewById<TextView>(R.id.tv_desPageDocumentDownloadNote)

        //changing the data of the views
        productMainImageView.setImageResource(productImage)
        productTitleTextview.text = productTitle
        productDescriptionTextView.text = productDescription

        //Setting condition of visibility of the pdf buttons,

        if (cataloguePath == "na"){
            cardViewCatalogue.visibility = View.GONE
        }
        if (msdsPath == "na"){
            cardViewMsds.visibility = View.GONE
        }
        if (sdsPath == "na"){
            cardViewSds.visibility = View.GONE
        }

        if(cataloguePath =="na" && msdsPath =="na" && sdsPath =="na"){
            textViewDownloadableTitle.visibility = View.GONE
            textViewDownloadableNote.visibility =View.GONE

        }



        //Setting up the pdfViewer cardViews
        cardViewCatalogue.setOnClickListener {
            startActivity(
                PdfViewerActivity.launchPdfFromPath(
                    context = this,
                    directoryName = "Download",
                    pdfTitle = "CATALOGUE OF $productTitle",
                    enableDownload = true,
                    fromAssets = true,
                    path = cataloguePath
                )
            )
        }

        cardViewMsds.setOnClickListener {
            startActivity(
                PdfViewerActivity.launchPdfFromPath(
                    context = this,
                    directoryName = "Download",
                    pdfTitle = "MSDS OF $productTitle",
                    enableDownload = true,
                    fromAssets = true,
                    path = msdsPath
                )
            )
        }


        cardViewSds.setOnClickListener {
            startActivity(
                PdfViewerActivity.launchPdfFromPath(
                    context = this,
                    directoryName = "Download",
                    pdfTitle = "SDS OF $productTitle",
                    enableDownload = true,
                    fromAssets = true,
                    path = sdsPath
                )
            )
        }


        if (sdsPath=="na" && msdsPath=="na"){
            textViewDownloadableTitle.visibility = View.GONE
            textViewDownloadableNote.visibility = View.GONE
        }





        //setting up the call and mail floating buttons
        floatingButtonCall.setOnClickListener {
            val intent = Intent(this, CallUsPage::class.java)
            startActivity(intent)
        }

        floatingButtonMail.setOnClickListener {
            val intent = Intent(this,MailUsPage::class.java)
            startActivity(intent)
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