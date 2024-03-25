package com.example.ecomarket.domain.interactor

import com.example.ecomarket.domain.model.ProductItem
import com.example.ecomarket.domain.repository.ProductRepository

class GetProductListInteractor(private val repository: ProductRepository) {

    fun getProductList(): List<ProductItem> {
        return repository.getProductList()
    }
}