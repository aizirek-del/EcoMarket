package com.example.ecomarket.data.repository

import com.example.ecomarket.data.api.Api
import com.example.ecomarket.domain.model.Category
import com.example.ecomarket.domain.model.ProductItem
import com.example.ecomarket.domain.repository.ProductRepository

class ProductRepositoryImpl(api: Api) : ProductRepository {
    override fun getProductCategory(): List<Category> {
        val response = api.getProductsCategory()
        return response
    }

    override fun getProductList(): List<ProductItem> {
        TODO("Not yet implemented")
    }
}