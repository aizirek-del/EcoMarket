package com.example.ecomarket.data.repository

import com.example.ecomarket.data.api.ProductApi
import com.example.ecomarket.domain.model.ProductItem
import com.example.ecomarket.domain.repository.ProductRepository

class ProductRepositoryImpl(private val productApi: ProductApi) : ProductRepository {
//    override fun getProductCategory(): List<Category> {
//        val response = productApi.getProductsCategory()
//        return response.map(ProductsMapper::fromNetwork)
//    }

    override fun getProductList(): List<ProductItem> {
        TODO("Not yet implemented")
    }
}