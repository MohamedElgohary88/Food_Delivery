package com.example.fooddelivery.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fooddelivery.R
import com.example.fooddelivery.SecondActivity
import kotlinx.android.synthetic.main.fragment_create_new_account_gmail.*

class CreateNewAccountGmailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_create_new_account_gmail, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_create_new_account_by_gmail.setOnClickListener {
            if (edit_text_name.text.isEmpty()){
                edit_text_name.error = "يرجى ادخال الاسم"
            }else{
                val i = Intent(requireActivity(), SecondActivity::class.java)
                startActivity(i)
            }
        }
    }
}