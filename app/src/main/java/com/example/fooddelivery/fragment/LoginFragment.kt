package com.example.fooddelivery.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.navigation.fragment.findNavController
import com.example.fooddelivery.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {
    lateinit var autoComplete: AutoCompleteTextView
    override fun onResume() {
        super.onResume()
        val countryKey = resources.getStringArray(R.array.country_key)
        val arrayAdapter = ArrayAdapter(this.requireContext(), R.layout.drop_down_item, countryKey)
        autoComplete.setAdapter(arrayAdapter)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_sendMessage_fragment_login.setOnClickListener {
            if(edit_text_phone.text.isEmpty()){
                edit_text_phone.error = "حقل اجبارى"
            }else if(edit_text_phone.text.length <= 9){
                edit_text_phone.error = "يرجى ادخال رقم صحيح"
            }else{
                findNavController().navigate(R.id.action_loginFragment_to_sendMessageFragment)
            }

        }
        create_new_account.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_createNewAccountFragment)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        autoComplete = view.findViewById(R.id.auto_complete_country)

        return view
    }
}