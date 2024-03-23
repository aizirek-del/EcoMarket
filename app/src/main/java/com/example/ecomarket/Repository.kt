package com.example.ecomarket

import com.example.ecomarket.model.Category
import com.example.ecomarket.model.ProductItem

interface Repository {

    fun getProductCategory(): List<Category>

    fun getProductList(): List<ProductItem>
}