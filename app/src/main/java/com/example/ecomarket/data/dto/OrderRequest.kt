package com.example.ecomarket.data.dto

import com.example.ecomarket.domain.model.Order
import com.google.gson.annotations.SerializedName

data class OrderRequest(
    @SerializedName("products")
    val products: Order,
    @SerializedName("phone_number")
    val phoneNumber: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("reference_point")
    val referencePoint: String,
    @SerializedName("comments")
    val comments: String,
 )