package com.example.fooddelivery.fragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fooddelivery.R
import kotlinx.android.synthetic.main.fragment_user.*


class UserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        log_out.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())

            builder.setPositiveButton("تسجيل خروج" ){ _ , _ ->
                requireActivity().finish()
                Toast.makeText(requireContext(),"تم تسجيل الخروج بنجاح",Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("الغاء "){ _ , _ ->
            }
            builder.setTitle("تسجيل الخروج")
            builder.setMessage("هل تريد الخروج من التطبيق؟")
            builder.create()
            builder.show()
        }

    }



}