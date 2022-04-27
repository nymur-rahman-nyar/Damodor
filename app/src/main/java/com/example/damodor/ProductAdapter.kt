package com.example.damodor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(
    var nameList: MutableList<String>
):RecyclerView.Adapter<ProductAdapter.ViewHolder>() {



    interface CustomClickInterface{
        fun itemClicked(position: Int)
    }

    private lateinit var clickListener: CustomClickInterface

    fun customClickListener(x: CustomClickInterface){
        clickListener = x
    }



    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val itemName = itemView.findViewById<TextView>(R.id.tv_productName)
        init {
            itemView.setOnClickListener {
                clickListener.itemClicked(adapterPosition)
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card_element, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var currentName = nameList[position]
        holder.itemName.text = currentName
    }

    override fun getItemCount(): Int {
        return nameList.size
    }
}