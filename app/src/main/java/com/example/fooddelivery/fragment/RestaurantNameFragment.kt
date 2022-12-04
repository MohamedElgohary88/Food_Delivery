package com.example.fooddelivery.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fooddelivery.R
import kotlinx.android.synthetic.main.fragment_restaurant_name.*

class RestaurantNameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurant_name, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageBack2.setOnClickListener {
            findNavController().popBackStack()
        }
        item_card.setOnClickListener {
            findNavController().navigate(R.id.action_restaurantNameFragment_to_bottomSheetFragment)
        }
    }

}