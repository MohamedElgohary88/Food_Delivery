package com.example.fooddelivery.adapter

import com.example.fooddelivery.model.Category
import com.example.fooddelivery.model.OfferCategory

interface OfferClickListener {
    fun offerClickListener(offerCategory: OfferCategory)
}