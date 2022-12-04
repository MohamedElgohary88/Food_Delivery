package com.example.fooddelivery.fragment

import android.content.Intent
import android.os.Bundle
import android.transition.Visibility
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import com.example.fooddelivery.OrderDetailsActivity
import com.example.fooddelivery.R
import com.example.fooddelivery.ShoppingCartActivity
import kotlinx.android.synthetic.main.fragment_request.*


class RequestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_request, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        card_view_continue.setOnClickListener {
            startActivity(Intent(requireActivity(),OrderDetailsActivity::class.java))
        }
        btn_past.setOnClickListener {
            card_view_continue.visibility  = View.GONE
            card_view_canceled.visibility = View.VISIBLE
            card_view_done.visibility = View.VISIBLE
        }
        btn_modern.setOnClickListener {
            card_view_canceled.visibility = View.GONE
            card_view_done.visibility = View.GONE
            card_view_continue.visibility  = View.VISIBLE
        }
        imageShop.setOnClickListener {
            val i = Intent(requireActivity(), ShoppingCartActivity::class.java)
            startActivity(i)
        }
    }
}