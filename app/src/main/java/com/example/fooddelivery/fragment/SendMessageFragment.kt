package com.example.fooddelivery.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fooddelivery.R
import com.example.fooddelivery.SecondActivity
import kotlinx.android.synthetic.main.fragment_send_message.*

class SendMessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_send_message, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_continue.setOnClickListener {
            if (edit_text_send_message.text.isEmpty()){
                edit_text_send_message.error = "يرجى ادخال رمز التحقق"
            }else if (edit_text_send_message.text.length <= 5){
                edit_text_send_message.error = "رمز التحقق خطأ"
            }
            else{
                findNavController().navigate(R.id.action_sendMessageFragment_to_createNewAccountGmailFragment)
            }
        }
    }
}