package com.example.ecomarket.api.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class OrderResponse(
    @SerializedName("order_number")
    val orderNumber: Int,
    @SerializedName("products")
    val products: List<Order>,
    @SerializedName("phone_number")
    val phoneNumber: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("reference_point")
    val referencePoint: String,
    @SerializedName("comments")
    val comments: String,
    @SerializedName("total_amount")
    val amount: Int,
    @SerializedName("created_at")
    val createdAt: Calendar,
    @SerializedName("delivery_cost")
    val deliveryCost: Int,
    @SerializedName("ordered_products")
    val orderedProducts: String
)

data class Order(
    @SerializedName("product")
    val product: Int,
    @SerializedName("quantity")
    val quantity: Int
)

