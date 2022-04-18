package com.example.damodor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GermKillerProductSearchPage : AppCompatActivity() {

    lateinit var adapter: ProductAdapter
    lateinit var recyclerView: RecyclerView

    private var nameList = mutableListOf<String>()
    private var displayNameList = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_germ_killer_product_search_page)

        setTitle("GK Germ Killer")


        //adding items to the name list
        nameList.add("Gk Air 300ml")
        nameList.add("Gk Air 5L")
        nameList.add("GK Surface 30ml")
        nameList.add("GK Surface 500ml")
        nameList.add("GK Surface 5L")
        nameList.add("Gk Concentrate 2L")
        nameList.add("Gk Concentrate 5L")

        //adding the content of the list to the display list

        displayNameList.addAll(nameList)

        adapter = ProductAdapter(displayNameList)
        recyclerView = findViewById(R.id.rv_GkGermKillerrecycler)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


}