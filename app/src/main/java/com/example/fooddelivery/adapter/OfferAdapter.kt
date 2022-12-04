package com.example.fooddelivery.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.R
import com.example.fooddelivery.model.OfferCategory

class OfferAdapter(val offer_array: ArrayList<OfferCategory>,private val offerClickListener: OfferClickListener) :
    RecyclerView.Adapter<OfferAdapter.OfferViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        return OfferViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_item_offer, parent, false)
        )
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        val offerCategory:OfferCategory = offer_array[position]
        holder.imageView.setImageResource(offerCategory.image)
        holder.textViewTitle.text = offerCategory.title
        holder.textViewDesc.text = offerCategory.desc

        holder.itemView.setOnClickListener {
            offerClickListener.offerClickListener(offerCategory)
        }
    }

    override fun getItemCount(): Int {
        return offer_array.size
    }

    class OfferViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.image_view_offer)
        val textViewTitle: TextView = view.findViewById(R.id.text_view_title_offer)
        val textViewDesc: TextView = view.findViewById(R.id.text_view_desc_offer)
    }

}