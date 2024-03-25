package com.example.ecomarket.domain.model

import java.util.*

data class OrderList(
    val orderNumber: Int,
    val products: List<OrderItem>,
    val phoneNumber: String,
    val address: String,
    val referencePoint: String,
    val comments: String,
    val amount: Int,
    val createdAt: Calendar,
    val deliveryCost: Int,
    val orderedProducts: String
)

data class OrderItem(
    val product: Int, val quantity: Int
)

