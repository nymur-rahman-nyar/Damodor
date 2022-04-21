package com.example.damodor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MrMckenicProductSearchPage : AppCompatActivity() {

    lateinit var adapter: ProductAdapter
    lateinit var recyclerView: RecyclerView

    private var nameList = mutableListOf<String>()
    private var displayNameList = mutableListOf<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mr_mckenic_product_search_page)

        //changing the title of the page
        setTitle("Mr.Mckenic Products")


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

        adapter = ProductAdapter(displayNameList)
        recyclerView = findViewById(R.id.rv_mrMckenicRecyclerView)
        recyclerView.adapter = adapter

        //this code below is very important which i forgot last time
        recyclerView.layoutManager = LinearLayoutManager(this)



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        //start - search filter code
        var items: MenuItem = menu!!.findItem(R.id.mi_SearchOption)
        if (items != null){
            var search = items.actionView as SearchView

            search.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(p0: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(p0: String?): Boolean {
                    if (p0!!.isNotEmpty()){
                        displayNameList.clear()
                        var searchInputValue = p0.lowercase(Locale.getDefault())
                        for (name in nameList){
                            if (name.lowercase(Locale.getDefault()).contains(searchInputValue)){
                                displayNameList.add(name)
                            }

                            recyclerView.adapter!!.notifyDataSetChanged()

                        }
                    }else{
                        displayNameList.clear()
                        displayNameList.addAll(nameList)

                        recyclerView.adapter!!.notifyDataSetChanged()
                    }

                    return true
                }
            })

        }


        //end - search filter code


        return super.onCreateOptionsMenu(menu)
    }
}