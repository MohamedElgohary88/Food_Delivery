package com.example.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.example.fooddelivery.fragment.HomeFragment
import com.example.fooddelivery.fragment.OfferFragment
import com.example.fooddelivery.fragment.RequestFragment
import com.example.fooddelivery.fragment.UserFragment
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setHomeFragment()
        bottomNavigationClicks()
    }

    private fun bottomNavigationClicks() {
        bottom_navigation?.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    chooseFragment(HomeFragment(), "الرئيسية")
                    supportActionBar?.title = "الرئيسية"
                }

                R.id.user -> {
                    chooseFragment(UserFragment(), "حسابي")
                    supportActionBar?.title = "حسابي"
                }

                R.id.request -> {
                    chooseFragment(RequestFragment(), "طلبات")
                    supportActionBar?.title = "طلبات"
                }

                R.id.offer -> {
                    chooseFragment(OfferFragment(), "عروض")
                    supportActionBar?.title = "عروض"
                }
            }
            true
        }
    }

    override fun onBackPressed() {
        // super.onBackPressed()
    }

    /*var counter = 0
    override fun onDestroy() {
        counter++ ;
        if (counter == 2) {
            super.onDestroy()
        }
    }*/

    private fun setHomeFragment() {
        chooseFragment(HomeFragment(), "الرئيسية")
        supportActionBar?.title = "الرئيسية"
    }

     fun chooseFragment(fragment: Fragment, tag: String) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment, tag)
        //   fragmentTransaction.addToBackStack(tag)
      //  fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTransaction.commit()
    }
}