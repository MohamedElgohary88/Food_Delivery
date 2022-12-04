package com.example.fooddelivery

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import kotlinx.android.synthetic.main.activity_shopping_cart.*

class ShoppingCartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_cart)

        complete_buy.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setPositiveButton("تتبع الطلب") { _, _ ->
                startActivity(Intent(this, OrderDetailsActivity::class.java))
                Toast.makeText(this, "تتبع الطلب", Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("العودة الى الصفحة الرئيسية ") { _, _ ->
                startActivity(Intent(this, SecondActivity::class.java))
            }
            builder.setTitle("تم استلام الطلب")
            builder.setMessage("شكرا لك تم استلام يمكنك متايعة طلبك ")
            builder.create()
            builder.show()
        }

    }
}