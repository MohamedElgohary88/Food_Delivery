package com.example.fooddelivery.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.fooddelivery.R
import com.example.fooddelivery.ShoppingCartActivity
import com.example.fooddelivery.ThirdActivity
import com.example.fooddelivery.adapter.ClickListener
import com.example.fooddelivery.adapter.HomeAdapter
import com.example.fooddelivery.model.Category
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), ClickListener {

    lateinit var autoCompleteCountry: AutoCompleteTextView
    private val array: ArrayList<Category> = ArrayList()

    override fun onResume() {
        super.onResume()

        val countryName = resources.getStringArray(R.array.country_name)
        val arrayAdapter = ArrayAdapter(this.requireContext(), R.layout.drop_down_item, countryName)
        autoCompleteCountry.setAdapter(arrayAdapter)
    }


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        autoCompleteCountry = view.findViewById(R.id.auto_complete_country)

        return view
    }

    override fun clickListener(category: Category) {
        if (category.id == 2) {
            //  Toast.makeText(requireContext(), "Clicked 2", Toast.LENGTH_SHORT).show()
            val i = Intent(requireActivity(),ThirdActivity::class.java)
            startActivity(i)

        } else {
            Toast.makeText(requireContext(), "Clicked ${category.id}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        data()
        shopping_cart.setOnClickListener {
            val i = Intent(requireActivity(),ShoppingCartActivity::class.java)
            startActivity(i)
        }
        recycler_view_home.setHasFixedSize(true)
        recycler_view_home.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val homeAdapter = HomeAdapter(array, this)
        recycler_view_home.adapter = homeAdapter
    }

    private fun data() {
        array.add(Category(1, "كافيهات", R.drawable.cafe))
        array.add(Category(2, "مطاعم", R.drawable.food))
        array.add(Category(3, "صيدليات", R.drawable.medicene))
        array.add(Category(3, "حلويات", R.drawable.cake_2))
        array.add(Category(4, "اجهزة", R.drawable.restaurant))
        array.add(Category(5, "ملابس", R.drawable.color_4))
    }
}