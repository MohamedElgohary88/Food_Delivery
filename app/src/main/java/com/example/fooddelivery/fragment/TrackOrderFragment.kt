package com.example.fooddelivery.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fooddelivery.R
import kotlinx.android.synthetic.main.fragment_track_order.*


class TrackOrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_track_order, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        copy_text.setOnClickListener {
            Toast.makeText(this.requireContext(),"تم النسخ",Toast.LENGTH_SHORT).show()
        }
    }
}