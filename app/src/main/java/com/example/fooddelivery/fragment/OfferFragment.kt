package com.example.fooddelivery.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.fooddelivery.R
import com.example.fooddelivery.ShoppingCartActivity
import com.example.fooddelivery.ThirdActivity
import com.example.fooddelivery.adapter.HomeAdapter
import com.example.fooddelivery.adapter.OfferAdapter
import com.example.fooddelivery.adapter.OfferClickListener
import com.example.fooddelivery.model.Category
import com.example.fooddelivery.model.OfferCategory
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_offer.*


class OfferFragment : Fragment(), OfferClickListener {
    private val offerArray: ArrayList<OfferCategory> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_offer, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOfferData()
        imageShoping.setOnClickListener {
            val i = Intent(requireActivity(), ShoppingCartActivity::class.java)
            startActivity(i)
        }
        recycler_view_offer.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recycler_view_offer.adapter = OfferAdapter(offerArray, this)
    }

    private fun setOfferData() {
        offerArray.add(
            OfferCategory(
                1,
                "العرض الثانى",
                getString(R.string.text_desc),
                R.drawable.food
            )
        )
        offerArray.add(
            OfferCategory(
                2,
                "العرض الثالث",
                getString(R.string.text_desc),
                R.drawable.restaurant
            )
        )
        offerArray.add(
            OfferCategory(
                3,
                "العرض الرابع",
                getString(R.string.text_desc),
                R.drawable.cake_2
            )
        )
        offerArray.add(
            OfferCategory(
                4,
                "العرض الخامس",
                getString(R.string.text_desc),
                R.drawable.cafe
            )
        )
        offerArray.add(
            OfferCategory(
                5,
                "العرض السادس",
                getString(R.string.text_desc),
                R.drawable.medicene
            )
        )
        offerArray.add(
            OfferCategory(
                6,
                "العرض السابع",
                getString(R.string.text_desc),
                R.drawable.ic_restaurant
            )
        )
    }

    override fun offerClickListener(offerCategory: OfferCategory) {
        Toast.makeText(requireContext(), offerCategory.title, Toast.LENGTH_SHORT).show()
        //  val i = Intent(requireActivity(), ThirdActivity::class.java)
        // startActivity(i)
    }

}