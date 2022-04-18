package com.example.damodor

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GermKillerAdapter(

    var nameList: MutableList<String>

):RecyclerView.Adapter<GermKillerAdapter.ViewHolder>() {
    inner class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        var productName = ItemView.findViewById<TextView>(R.id.tv_productName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card_element, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var currentName = nameList[position]
        holder.productName.text = currentName
    }

    override fun getItemCount(): Int {
        return nameList.size
    }
}