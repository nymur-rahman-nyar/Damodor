package com.example.damodor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EngineeringProductSearchPage : AppCompatActivity() {

    lateinit var adapter: ProductAdapter
    lateinit var recyclerView: RecyclerView

    private var nameList = mutableListOf<String>()
    private var displayNameList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_engineering_product_search_page)
        // chaning the title
        setTitle("Our Services")

        //adding the element to the namelist
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")
        nameList.add("service")

        //adding the elements to the display list
        displayNameList.addAll(nameList)

        adapter = ProductAdapter(nameList)
        recyclerView = findViewById(R.id.rv_engineeringServices)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}