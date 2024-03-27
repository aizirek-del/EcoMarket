package com.example.ecomarket

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ecomarket.core.common.Constants
import com.example.ecomarket.data.api.ProductApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.text)
        val but = findViewById<Button>(R.id.button)
        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val api = retrofit.create(ProductApi::class.java)
        but.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                val product = api.getProductsCategory()
                runOnUiThread {
                    text.text = product.name
                }
            }
        }
    }
}