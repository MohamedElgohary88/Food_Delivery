package com.example.fooddelivery.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fooddelivery.R
import kotlinx.android.synthetic.main.fragment_create_new_account.*
import kotlinx.android.synthetic.main.fragment_login.*

class CreateNewAccountFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_sendMessage_fragment_create_new_account.setOnClickListener {
            if (edit_text_phone2.text.isEmpty()) {
                edit_text_phone2.error = "حقل اجبارى"
            } else if (edit_text_phone2.text.length <= 9) {
                edit_text_phone2.error = "يرجى ادخال رقم صحيح"
            } else {
              findNavController().navigate(R.id.action_createNewAccountFragment_to_sendMessageFragment)
            }
        }
        text_login.setOnClickListener { findNavController().popBackStack() }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_create_new_account, container, false)

        return view
    }

}