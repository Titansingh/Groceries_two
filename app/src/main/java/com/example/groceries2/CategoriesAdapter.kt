package com.example.groceriesshoppingapp

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.groceries2.HomeFragment
import com.example.groceries2.R
import com.example.groceries2.category


class CategoriesAdapter (
    private val items: ArrayList<category>,

    private val listner: HomeFragment
) : RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.store_item, parent, false)
        val viewHolder = CategoriesViewHolder(view)
        view.setOnClickListener {
            listner.onItemClicked(items[viewHolder.adapterPosition])

        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val currentItem = items[position].name
        holder.titleView.text = currentItem





    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class CategoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.item_name)



}

interface Chatitemclicked {
    fun onItemClicked(item: category)
}

fun String.toBitmap(): Bitmap? {
    Base64.decode(this, Base64.DEFAULT).apply {
        return BitmapFactory.decodeByteArray(this, 0, size)
    }
}