package com.example.fooddelivery.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.R
import com.example.fooddelivery.model.Category

class HomeAdapter(
    val array: ArrayList<Category>,
    private val clickListener: ClickListener
) :
    RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_item_home, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val category: Category = array[position]
        holder.imageView.setImageResource(category.image)
        holder.textView.text = category.type

        holder.itemView.setOnClickListener {
            clickListener.clickListener(array[position])
        }

    }

    override fun getItemCount(): Int {
        return array.size
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.image_view_item)
        val textView: TextView = view.findViewById(R.id.text_view_item)
    }

}