package com.example.damodor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MrMckenicProductSearchPage : AppCompatActivity() {

    lateinit var adapter: MrMckenicAdapter
    lateinit var recyclerView: RecyclerView

    private var nameList = mutableListOf<String>()
    private var displayNameList = mutableListOf<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mr_mckenic_product_search_page)

        //changing the title of the page
        setTitle("Mr.Mckenic Product")


        //adding the products to the main list.
        nameList.add("product 1")
        nameList.add("product 2")
        nameList.add("product 3")
        nameList.add("product 4")
        nameList.add("product 5")
        nameList.add("product 6")
        nameList.add("product 7")

        //adding the product to the display list from the main list.

        displayNameList.addAll(nameList)

        adapter = MrMckenicAdapter(displayNameList)
        recyclerView = findViewById(R.id.rv_mrMckenicRecyclerView)
        recyclerView.adapter = adapter

        //this code below is very important which i forgot last time
        recyclerView.layoutManager = LinearLayoutManager(this)



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}