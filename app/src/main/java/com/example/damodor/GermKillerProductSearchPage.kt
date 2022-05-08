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
        nameList.add("GK SURFACE WIPES")
        nameList.add("GK SURFACE")
        nameList.add("GK AIR")
        nameList.add("GK CONCENTRATE")

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
                                val image:Int = R.drawable.product_gk_img_surface_swipe
                                val title:String = nameList[0]
                                val description:String = getString(R.string.gk_surface_wipes_description)
                                val catPath:String = "product_gk_cat_surface_wipes.pdf"
                                val msdsPath:String ="na"
                                val sdsPath:String ="product_gk_sds_surface.pdf"

                                //sending values to other activity
                                intent.putExtra("EXTRA_IMAGE",image)
                                intent.putExtra("EXTRA_TITLE",title)
                                intent.putExtra("EXTRA_DESCRIPTION",description)
                                intent.putExtra("EXTRA_CAT_PATH",catPath)
                                intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                                intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                                startActivity(intent)
                    }
                    nameList[1] -> {
                                val intent = Intent(this@GermKillerProductSearchPage,ProductDescriptionPage::class.java)

                                //change the value below
                                val image:Int = R.drawable.product_gk_img_surface
                                val title:String = nameList[1]
                                val description:String = getString(R.string.gk_surface_liquid_description)
                                val catPath:String = "product_gk_cat_surface.pdf"
                                val msdsPath:String ="na"
                                val sdsPath:String ="product_gk_sds_surface.pdf"

                                //sending values to other activity
                                intent.putExtra("EXTRA_IMAGE",image)
                                intent.putExtra("EXTRA_TITLE",title)
                                intent.putExtra("EXTRA_DESCRIPTION",description)
                                intent.putExtra("EXTRA_CAT_PATH",catPath)
                                intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                                intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                                startActivity(intent)


                    }

                    nameList[2]-> {
                                val intent = Intent(this@GermKillerProductSearchPage,ProductDescriptionPage::class.java)

                                //change the value below
                                val image:Int = R.drawable.product_gk_img_air
                                val title:String = nameList[2]
                                val description:String = getString(R.string.gk_air_description)
                                val catPath:String = "product_gk_cat_air.pdf"
                                val msdsPath:String ="na"
                                val sdsPath:String ="product_gk_sds_air.pdf"

                                //sending values to other activity
                                intent.putExtra("EXTRA_IMAGE",image)
                                intent.putExtra("EXTRA_TITLE",title)
                                intent.putExtra("EXTRA_DESCRIPTION",description)
                                intent.putExtra("EXTRA_CAT_PATH",catPath)
                                intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                                intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                                startActivity(intent)
                    }


                    nameList[3]-> {
                        val intent = Intent(this@GermKillerProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_gk_img_concentrate
                        val title:String = nameList[3]
                        val description:String = getString(R.string.gk_concentrate_description)
                        val catPath:String = "product_gk_cat_concentrate.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_gk_sds_concentrate.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
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