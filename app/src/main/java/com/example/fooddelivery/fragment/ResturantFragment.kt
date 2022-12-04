package com.example.fooddelivery.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddelivery.R
import com.example.fooddelivery.ThirdActivity
import com.example.fooddelivery.adapter.OfferAdapter
import com.example.fooddelivery.adapter.RestaurantClickListener
import com.example.fooddelivery.adapter.ResturantAdapter
import com.example.fooddelivery.model.OfferCategory
import com.example.fooddelivery.model.Resturant
import kotlinx.android.synthetic.main.fragment_offer.*
import kotlinx.android.synthetic.main.fragment_resturant.*

class ResturantFragment : Fragment(), RestaurantClickListener {
    private val resturantArray: ArrayList<Resturant> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resturant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setResturant()


        recycler_view_resturant.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recycler_view_resturant.adapter = ResturantAdapter(resturantArray, this)
    }

    private fun setResturant() {
        resturantArray.add(Resturant(1, " المعلم كفته ", "2.4", "4.6", "12", R.drawable.food))
        resturantArray.add(Resturant(2, " المعلم كبده ", "2.1", "4.2", "13", R.drawable.food))
        resturantArray.add(Resturant(3, " شاورما لحمه ", "3.2", "4.3", "18", R.drawable.food))
        resturantArray.add(Resturant(4, " شيش طاووق ", "1.5", "4.4", "10", R.drawable.food))
        resturantArray.add(Resturant(5, " اكل شعبى ", "0.5", "4.3", "11", R.drawable.food))
        resturantArray.add(Resturant(6, " كبده اسكندرانى ", "1.9", "4.8", "14", R.drawable.food))
    }

    override fun clickListener(resturant: Resturant) {
        findNavController().navigate(R.id.action_resturantFragment2_to_restaurantNameFragment)
    }
}