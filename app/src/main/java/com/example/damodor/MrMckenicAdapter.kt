package com.example.damodor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MrMckenicAdapter(
    var nameList: MutableList<String>
):RecyclerView.Adapter<MrMckenicAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val itemName = itemView.findViewById<TextView>(R.id.tv_productName)
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