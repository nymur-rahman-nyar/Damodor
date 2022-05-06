package com.example.damodor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class GermKillerProductSearchPage : AppCompatActivity() {

    lateinit var adapter: ProductAdapter
    lateinit var recyclerView: RecyclerView

    private var nameList = mutableListOf<String>()
    private var displayNameList = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_germ_killer_product_search_page)

        //setting up the back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

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

        var displayPosition = 0

        adapter.customClickListener(object: ProductAdapter.CustomClickInterface{
            override fun itemClicked(position: Int) {
                displayPosition = position
                val titleOfProduct = clickedItemName(displayPosition,displayNameList)
                when(titleOfProduct){
                    nameList[0] -> {
                                val intent = Intent(this@GermKillerProductSearchPage,ProductDescriptionPage::class.java)

                                //change the value below
                                val image:Int = R.drawable.illustrate_gkgermkiller
                                val title:String = "This is a germ killer product"
                                val description:String ="This is a germ killer description"
                                val catPath:String = ""
                                val msdsPath:String =""

                                //sending values to other activity
                                intent.putExtra("EXTRA_IMAGE",image)
                                intent.putExtra("EXTRA_TITLE",title)
                                intent.putExtra("EXTRA_DESCRIPTION",description)
                                intent.putExtra("EXTRA_CAT_PATH",catPath)
                                intent.putExtra("EXTRA_MSDS_PATH",msdsPath)

                                startActivity(intent)
                    }
                    nameList[1] -> {

                    }

                }




            }
        })


    }


    fun clickedItemName(displayPosition: Int, displayList: MutableList<String>):String{
        //find the item name
        var title = displayList[displayPosition]

        return title
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)

        var items: MenuItem = menu!!.findItem(R.id.mi_SearchOption)
        if(items != null){
            var menuItemSearchView = items.actionView as SearchView
            menuItemSearchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(textField: String?): Boolean {
                    return true // when changes are made (live)
                }

                override fun onQueryTextChange(textField: String?): Boolean { // When the changes have been made totally
                    if(textField!!.isNotEmpty()){
                        displayNameList.clear() //Clearing the display list
                        var searchInput = textField.lowercase(Locale.getDefault()) // taking the input of the user and turning it into a variable

                        for(name in nameList){
                            if (name.lowercase(Locale.getDefault()).contains(searchInput)){
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


        return super.onCreateOptionsMenu(menu)
    }


}