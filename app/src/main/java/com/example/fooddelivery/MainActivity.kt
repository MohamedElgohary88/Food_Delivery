package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.fragment_send_message.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  setupActionBarWithNavController(findNavController(R.id.fragment))

    }

/*    override fun onSupportNavigateUp(): Boolean {
        var navigate = findNavController(R.id.fragment)
        return navigate.navigateUp() || super.onSupportNavigateUp()
    }*/

}