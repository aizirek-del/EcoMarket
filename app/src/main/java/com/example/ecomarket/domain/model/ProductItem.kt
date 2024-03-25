package com.example.ecomarket.domain.model

import com.example.ecomarket.data.dto.CategoryResponse

data class ProductItem(
    val id: Int,
    val title: String,
    val description:String,
    val category: CategoryResponse,
    val image: String,
    val quantity:Int,
    val price: String
)