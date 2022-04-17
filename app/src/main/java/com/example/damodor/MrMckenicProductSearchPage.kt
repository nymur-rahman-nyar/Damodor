package com.example.damodor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MrMckenicProductSearchPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mr_mckenic_product_search_page)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mrmckenic_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}