package com.example.ecomarket.domain.repository

import com.example.ecomarket.domain.model.Category
import com.example.ecomarket.domain.model.ProductItem

interface ProductRepository {

//    fun getProductCategory(): List<Category>

    fun getProductList(): List<ProductItem>
}