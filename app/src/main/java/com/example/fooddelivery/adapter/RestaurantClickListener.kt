package com.example.fooddelivery.adapter

import com.example.fooddelivery.model.Category
import com.example.fooddelivery.model.Resturant

interface RestaurantClickListener {
    fun clickListener(resturant: Resturant)
}