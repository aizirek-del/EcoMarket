package com.example.ecomarket.api.model

import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description:String,
    @SerializedName("category")
    val category: CategoryResponse,
    @SerializedName("image")
    val image: String,
    @SerializedName("quantity")
    val quantity:Int,
    @SerializedName("price")
    val price: String
)
