package com.example.damodor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class EngineeringProductSearchPage : AppCompatActivity() {

    lateinit var adapter: ProductAdapter
    lateinit var recyclerView: RecyclerView

    private var nameList = mutableListOf<String>()
    private var displayNameList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_engineering_product_search_page)
        //setting up the back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // chaning the title
        setTitle("Our Services")

        //adding the element to the namelist
        nameList.add("Duct, Fabrication and Installation")
        nameList.add("All kinds of duct material supply")
        nameList.add("Pipe Line Fabrication and installation ")
        nameList.add("All kinds of insulation supply")
        nameList.add("All kinds of fabrication and installation works")
        nameList.add("All kinds of pipe supply, Fabrication and Installation ")
        nameList.add("All kinds of fire hydrant system fabrication and installation works")
        nameList.add("All kinds of insulation material supply fabrication and installation")
        nameList.add("All kind of SS, MS, GP Aluminum components supply")


        //adding the elements to the display list
        displayNameList.addAll(nameList)

        adapter = ProductAdapter(displayNameList)
        recyclerView = findViewById(R.id.rv_engineeringServices)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        var displayPosition = 0

        adapter.customClickListener(object: ProductAdapter.CustomClickInterface{
            override fun itemClicked(position: Int) {
                displayPosition = position
                val titleOfProduct = clickedItemName(displayPosition,displayNameList)
                when(titleOfProduct){
                    nameList[0] -> {
                        val intent = Intent(this@EngineeringProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.service_img_1_duct_fabrication_and_installation
                        val title:String = nameList[0]
                        val description:String =getString(R.string.service_1_duct_fabrication_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="na"

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
                        val intent = Intent(this@EngineeringProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.service_img_2_all_kinds_of_duct_material_supply
                        val title:String = nameList[1]
                        val description:String =getString(R.string.service_2_duct_material_supply_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="na"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[2] -> {
                        val intent = Intent(this@EngineeringProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.service_img_3_all_types_of_pipe_fabrication
                        val title:String = nameList[2]
                        val description:String =getString(R.string.service_3_pipeline_fabrication_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="na"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[3] -> {
                        val intent = Intent(this@EngineeringProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.service_img_4_all_kinds_of_insulation_supply
                        val title:String = nameList[3]
                        val description:String =getString(R.string.service_4_all_kinds_of_insulation_supply_work_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="na"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[4] -> {
                        val intent = Intent(this@EngineeringProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.service_img_5_all_kinds_of_fabrication_work
                        val title:String = nameList[4]
                        val description:String =getString(R.string.service_5_fabrication_and_installation_works_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="na"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[5] -> {
                        val intent = Intent(this@EngineeringProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.service_img_6_pipeline_fabrication_and_installation
                        val title:String = nameList[5]
                        val description:String =getString(R.string.service_6_all_kinds_of_pipe_supply_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="na"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[6] -> {
                        val intent = Intent(this@EngineeringProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.service_img_7_all_kinds_of_fire_hydrant_system_installation
                        val title:String = nameList[6]
                        val description:String =getString(R.string.service_7_hydrant_system_fabrication_and_installation_works)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="na"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[7] -> {
                        val intent = Intent(this@EngineeringProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.service_img_4_all_kinds_of_insulation_supply
                        val title:String = nameList[6]
                        val description:String =getString(R.string.service_8_fabrication_and_installation_material_supply_works)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="na"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[8] -> {
                        val intent = Intent(this@EngineeringProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.service_img_9_all_ms_ss_components
                        val title:String = nameList[8]
                        val description:String =getString(R.string.service_9_all_kinds_of_ss_ms_gp_component_supply)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="na"

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