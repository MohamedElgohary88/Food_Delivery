package com.example.fooddelivery.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.R
import com.example.fooddelivery.model.Resturant


class ResturantAdapter(
    val array: ArrayList<Resturant>,
    private val restaurantClickListener: RestaurantClickListener
) :
    RecyclerView.Adapter<ResturantAdapter.ResturantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResturantViewHolder {
        return ResturantViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_resturant, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ResturantViewHolder, position: Int) {
        val resturant: Resturant = array[position]
        holder.imageView.setImageResource(resturant.image)
        holder.title.text = resturant.title
        holder.distance.text = resturant.distance
        holder.rate.text = resturant.rate
        holder.fee.text = resturant.deliveryFee

        holder.itemView.setOnClickListener {
            restaurantClickListener.clickListener(resturant)
        }

    }

    override fun getItemCount(): Int {
        return array.size
    }

    class ResturantViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.image_view_resturant)
        val title: TextView = view.findViewById(R.id.title_resturant)
        val distance: TextView = view.findViewById(R.id.distance_resturant)
        val rate: TextView = view.findViewById(R.id.rate_resturant)
        val fee: TextView = view.findViewById(R.id.fee_delevery_resturant)
    }
}