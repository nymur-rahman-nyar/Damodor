package com.example.damodor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
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

        //setting up the back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        //changing the title of the page
        setTitle("Mr.Mckenic Products")


        //adding the products to the main list.
        nameList.add("AC1923 Processed Alkaline Industrial Coil Cleaner")
        nameList.add("AC1926 Air Conditioner Cleaner")
        nameList.add("BC8618 Cream Polisher")
        nameList.add("DR8211(1) Multi-Purpose Cleaner (M97-1)")
        nameList.add("DR8211(A) Multi-purpose Cleaner M97(A)")
        nameList.add("EE1325 Contact Cleaner & Lubricant")
        nameList.add("EE1331 Contact Cleaner (Fast Dry)")
        nameList.add("EE1332-A  Contact Cleaner (Aerosol)")
        nameList.add("GG3012 Anti-Seize Compound")
        nameList.add("GG3017 Non-Melt Red Grease")
        nameList.add("GG3020 SYNTHETIC HT GREASE")
        nameList.add("LU1801 DRY MOLY LUBRICANT")
        nameList.add("LU1802 Movable Belt Conditioner")
        nameList.add("LU1809 Silicone Spray (Aerosol)")
        nameList.add("LU1822 Silicon Oil 1000")
        nameList.add("LU1823 FULLY SYNTHETIC COMPRESSOR OIL (PAO + ESTER)")
        nameList.add("LU1825(1) Gear Oil M220")
        nameList.add("LU1825(2) Gear Oil 320")
        nameList.add("LU1825 Gear Oil M150")
        nameList.add("LU1826(1) HYDRAULIC OIL M22")
        nameList.add("LU1826 Hydraulic Oil M68")
        nameList.add("LU1826 HYDRAULIC OIL M46")
        nameList.add("LU1827 Gear Oil CHL 220")
        nameList.add("LU1827 H.T. Chain Oil CHL 220")
        nameList.add("LU1835(1) Chain Cleaner 150")
        nameList.add("LU1835 Chain Oil 68")
        nameList.add("ME1201(1) Penetrant Oil")
        nameList.add("ME1208 9-in-1 Technology Oil")
        nameList.add("WT3901(1) Scale & Corrosion Inhibitor")
        nameList.add("WT3902(1) Concentrated Liquid Descaler")
        nameList.add("WT3905 Non-Fuming Descaler")
        nameList.add("WT3907(1) Algae-Con")
        nameList.add("WT3907 Algaecide (Liquid)")
        nameList.add("WT3909 Biocide")
        nameList.add("WT3910 Anti – Foam Agent")
        nameList.add("WT3912 Oxygen Scavenger (Powder)")
        nameList.add("WT3919 Boiler Conditioner SP")
        nameList.add("WT3920(2) Boiler Conditioner")
        nameList.add("WT3921(1) M2000(1)")
        nameList.add("WT3933(1) Cooling Water Treatment (DA-1)")
        nameList.add("WT3933 Cooling Water Treatment – DA")
        nameList.add("WT3934 Cooling Water Treatment-NT")

        //adding the product to the display list from the main list.

        displayNameList.addAll(nameList)

        adapter = ProductAdapter(displayNameList)
        recyclerView = findViewById(R.id.rv_mrMckenicRecyclerView)
        recyclerView.adapter = adapter

        //this code below is very important which i forgot last time
        recyclerView.layoutManager = LinearLayoutManager(this)

        var clickedIndexDisplayList = 0
        adapter.customClickListener(object: ProductAdapter.CustomClickInterface{
            override fun itemClicked(position: Int) {
                clickedIndexDisplayList = position
                var elementName = findItemName(clickedIndexDisplayList,displayNameList)

                //From here we are adding the condition of the click listener
                when(elementName){
                        nameList[0] -> {
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_25_and_5_liter
                            val title:String = nameList[0]
                            val description:String = getString(R.string.ac1923_description)
                            val catPath:String = "product_mrmckenic_ac1923_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_ac1923_sds.pdf"

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
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_ac1926
                            val title:String = nameList[1]
                            val description:String = getString(R.string.ac1926_description)
                            val catPath:String = "product_mrmckenic_ac1926_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_ac1926_sds.pdf"

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
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckneic_img_20liter
                        val title:String = nameList[2]
                        val description:String = getString(R.string.bc8618_description)
                        val catPath:String = "product_mrmckenic_bc8618_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_bc8618_sds (2).pdf"

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
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_25liter
                            val title:String = nameList[3]
                            val description:String = getString(R.string.dr8211_1_description)
                            val catPath:String = "product_mrmckenic_dr8211(1)_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_dr8211(1)_sds.pdf"

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
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_25liter
                            val title:String = nameList[4]
                            val description:String = getString(R.string.dr8211_1_description)
                            val catPath:String = "product_mrmckenic_dr8211(a)_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_dr8211(a)_sds.pdf"

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
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_ee1325
                            val title:String = nameList[5]
                            val description:String = getString(R.string.ee1325_description)
                            val catPath:String = "product_mrmckenic_ee1325_cat.pdf"
                            val msdsPath:String ="product_mrmckenic_ee1325_msds.pdf"
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
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_ee1331
                            val title:String = nameList[6]
                            val description:String = getString(R.string.ee1331_description)
                            val catPath:String = "product_mrmckenic_ee1331_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_ee1331_sds.pdf"

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
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_ee1325
                            val title:String = nameList[7]
                            val description:String = getString(R.string.ee1332_a_description)
                            val catPath:String = "na"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_ee1332_sds.pdf"

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
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_5kg
                            val title:String = nameList[8]
                            val description:String = getString(R.string.gg3012_description)
                            val catPath:String = "product_mrmckenic_gg3012_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_gg3012_sds.pdf"

                            //sending values to other activity
                            intent.putExtra("EXTRA_IMAGE",image)
                            intent.putExtra("EXTRA_TITLE",title)
                            intent.putExtra("EXTRA_DESCRIPTION",description)
                            intent.putExtra("EXTRA_CAT_PATH",catPath)
                            intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                            intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                            startActivity(intent)
                        }
                        nameList[9] -> {
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_5kg
                            val title:String = nameList[9]
                            val description:String = getString(R.string.gg3017_description)
                            val catPath:String = "product_mrmckenic_gg3017_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_gg3017_sds.pdf"

                            //sending values to other activity
                            intent.putExtra("EXTRA_IMAGE",image)
                            intent.putExtra("EXTRA_TITLE",title)
                            intent.putExtra("EXTRA_DESCRIPTION",description)
                            intent.putExtra("EXTRA_CAT_PATH",catPath)
                            intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                            intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                            startActivity(intent)
                        }
                        nameList[10] -> {
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_5kg
                            val title:String = nameList[10]
                            val description:String = getString(R.string.gg3020_description)
                            val catPath:String = "product_mrmckenic_gg3020_cat.pdf"
                            val msdsPath:String ="product_mrmckenic_gg3020_msds.pdf"
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
                        nameList[11] -> {
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_lu1801
                            val title:String = nameList[11]
                            val description:String = getString(R.string.lu1801_description)
                            val catPath:String = "product_mrmckenic_lu1801_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_lu1801_sds_aerosol.pdf"

                            //sending values to other activity
                            intent.putExtra("EXTRA_IMAGE",image)
                            intent.putExtra("EXTRA_TITLE",title)
                            intent.putExtra("EXTRA_DESCRIPTION",description)
                            intent.putExtra("EXTRA_CAT_PATH",catPath)
                            intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                            intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                            startActivity(intent)
                        }
                        nameList[12] -> {
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.ic_default_image_product_photo
                            val title:String = nameList[12]
                            val description:String = getString(R.string.lu1802_description)
                            val catPath:String = "product_mrmckenic_lu1802_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_lu1802_sds.pdf"

                            //sending values to other activity
                            intent.putExtra("EXTRA_IMAGE",image)
                            intent.putExtra("EXTRA_TITLE",title)
                            intent.putExtra("EXTRA_DESCRIPTION",description)
                            intent.putExtra("EXTRA_CAT_PATH",catPath)
                            intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                            intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                            startActivity(intent)
                        }
                        nameList[13] -> {
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_lu1809
                            val title:String = nameList[13]
                            val description:String = getString(R.string.lu1809_description)
                            val catPath:String = "product_mrmckenic_lu1809_cat.pdf"
                            val msdsPath:String ="na"
                            val sdsPath:String ="product_mrmckenic_lu1809(1)_sds.pdf"

                            //sending values to other activity
                            intent.putExtra("EXTRA_IMAGE",image)
                            intent.putExtra("EXTRA_TITLE",title)
                            intent.putExtra("EXTRA_DESCRIPTION",description)
                            intent.putExtra("EXTRA_CAT_PATH",catPath)
                            intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                            intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                            startActivity(intent)
                        }
                        nameList[14] -> {
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_25_and_5_liter
                            val title:String = nameList[14]
                            val description:String = getString(R.string.lu1822_description)
                            val catPath:String = "product_mrmckenic_lu1822_cat.pdf"
                            val msdsPath:String ="product_mrmckenic_lu1822_msds.pdf"
                            val sdsPath:String ="product_mrmckenic_lu1822_sds.pdf"

                            //sending values to other activity
                            intent.putExtra("EXTRA_IMAGE",image)
                            intent.putExtra("EXTRA_TITLE",title)
                            intent.putExtra("EXTRA_DESCRIPTION",description)
                            intent.putExtra("EXTRA_CAT_PATH",catPath)
                            intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                            intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                            startActivity(intent)
                        }
                        nameList[15] -> {
                            val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                            //change the value below
                            val image:Int = R.drawable.product_mrmckenic_img_25liter
                            val title:String = nameList[15]
                            val description:String = getString(R.string.lu1823_description)
                            val catPath:String = "product_mrmckenic_lu1823_cat.pdf"
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
                        nameList[16] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[16]
                        val description:String = getString(R.string.lu1825_1_description)
                        val catPath:String = "product_mrmckenic_lu1825(1)_cat.pdf"
                        val msdsPath:String ="product_mrmckenic_lu1825(1)_msds.pdf"
                        val sdsPath:String ="product_mrmckenic_lu1825(1)_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[17] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[17]
                        val description:String = getString(R.string.lu1825_2_description)
                        val catPath:String = "product_mrmckenic_lu1825(2)_cat.pdf"
                        val msdsPath:String ="product_mrmckenic_lu1825(2)_msds.pdf"
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
                    nameList[18] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[18]
                        val description:String = getString(R.string.lu1825_description)
                        val catPath:String = "product_mrmckenic_lu1825_cat.pdf"
                        val msdsPath:String ="product_mrmckenic_lu1825_msds.pdf"
                        val sdsPath:String ="product_mrmckenic_lu1825_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[19] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[19]
                        val description:String = getString(R.string.lu1826_1_description)
                        val catPath:String = "na"
                        val msdsPath:String ="product_mrmckenic_lu1826(1)_msds.pdf"
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
                    nameList[20] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[20]
                        val description:String = getString(R.string.lu1826_description)
                        val catPath:String = "product_mrmckenic_lu1826_cat_m68.pdf"
                        val msdsPath:String ="product_mrmckenic_lu1826_msds_m46.pdf"
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
                    nameList[21] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[21]
                        val description:String = getString(R.string.lu1826_m46_description)
                        val catPath:String = "na"
                        val msdsPath:String ="product_mrmckenic_lu1826_msds_m46.pdf"
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
                    nameList[22] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[22]
                        val description:String = getString(R.string.lu1827_chain_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_lu1827_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[23] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[23]
                        val description:String = getString(R.string.lu1827_gear_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_lu1827_sds_gearoil.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[24] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[24]
                        val description:String = getString(R.string.lu1835_1_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_lu1835(1)_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[25] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[25]
                        val description:String = getString(R.string.lu1835_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_lu1835_sds_chainOil.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[26] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_5liter
                        val title:String = nameList[26]
                        val description:String = getString(R.string.me1201_1_description)
                        val catPath:String = "product_mrmckenic_me1201(1)_cat.pdf"
                        val msdsPath:String ="product_mrmckenic_me1201(1)A_msds.pdf"
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
                    nameList[27] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_me1208
                        val title:String = nameList[27]
                        val description:String = getString(R.string.me1208_description)
                        val catPath:String = "product_mrmckenic_me1208_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_me1208_sds_aerosol.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[28] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[28]
                        val description:String = getString(R.string.wt3901_1_description)
                        val catPath:String = "product_mrmckenic_wt3901(1)_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3901(1)_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[29] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[29]
                        val description:String = getString(R.string.wt3902_1_description)
                        val catPath:String = "product_mrmckenic_wt3902(1)_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3902(1)_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[30] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[30]
                        val description:String = getString(R.string.wt3905_description)
                        val catPath:String = "product_mrmckenic_wt3905_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3905_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[31] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[31]
                        val description:String = getString(R.string.wt3907_1_description)
                        val catPath:String = "product_mrmckenic_wt3907(1)_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3907(1)_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[32] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[32]
                        val description:String = getString(R.string.wt3907_description)
                        val catPath:String = "product_mrmckenic_wt3907_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3907_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[33] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[33]
                        val description:String = getString(R.string.wt3909_description)
                        val catPath:String = "product_mrmckenic_wt3909_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3909_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[34] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[34]
                        val description:String = getString(R.string.wt3910_description)
                        val catPath:String = "product_mrmckenic_wt3910_cat.pdf"
                        val msdsPath:String ="product_mrmckenic_wt3910_msds.pdf"
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
                    nameList[35] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckneic_img_20liter
                        val title:String = nameList[35]
                        val description:String = getString(R.string.wt3912_description)
                        val catPath:String = "product_mrmckenic_wt3912_cat.pdf"
                        val msdsPath:String ="product_mrmckenic_wt3912_msds.pdf"
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
                    nameList[36] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[36]
                        val description:String = getString(R.string.wt3919_description)
                        val catPath:String = "product_mrmckenic_wt3919_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3919_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[37] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[37]
                        val description:String = getString(R.string.wt3920_2_description)
                        val catPath:String = "product_mrmckenic_wt3920_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3920(2)_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[38] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[38]
                        val description:String = getString(R.string.wt3921_1_description)
                        val catPath:String = "product_mrmckenic_wt3921(1)_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3921(1)_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[39] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[39]
                        val description:String = getString(R.string.wt3933_1_description)
                        val catPath:String = "na"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3933(1)_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[40] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[40]
                        val description:String = getString(R.string.wt3933_description)
                        val catPath:String = "product_mrmckenic_wt3933_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3933_sds.pdf"

                        //sending values to other activity
                        intent.putExtra("EXTRA_IMAGE",image)
                        intent.putExtra("EXTRA_TITLE",title)
                        intent.putExtra("EXTRA_DESCRIPTION",description)
                        intent.putExtra("EXTRA_CAT_PATH",catPath)
                        intent.putExtra("EXTRA_MSDS_PATH",msdsPath)
                        intent.putExtra("EXTRA_SDS_PATH",sdsPath)

                        startActivity(intent)
                    }
                    nameList[41] -> {
                        val intent = Intent(this@MrMckenicProductSearchPage,ProductDescriptionPage::class.java)

                        //change the value below
                        val image:Int = R.drawable.product_mrmckenic_img_25liter
                        val title:String = nameList[41]
                        val description:String = getString(R.string.wt3934_description)
                        val catPath:String = "product_mrmckenic_wt3934_cat.pdf"
                        val msdsPath:String ="na"
                        val sdsPath:String ="product_mrmckenic_wt3934_sds.pdf"

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

    fun findItemName(displayIndex: Int, displayList: MutableList<String>):String{
        var elementName = displayList[displayIndex]

        return elementName
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        //start - search filter code
        var items: MenuItem = menu!!.findItem(R.id.mi_SearchOption) //finding the menu item


        if (items != null){ // null checking the value of the search view
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