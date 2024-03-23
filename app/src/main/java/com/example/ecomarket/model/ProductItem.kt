package com.example.ecomarket.model

import com.example.ecomarket.api.model.CategoryResponse
import com.google.gson.annotations.SerializedName

data class ProductItem(
    val id: Int,
    val title: String,
    val description:String,
    val category: CategoryResponse,
    val image: String,
    val quantity:Int,
    val price: String
)