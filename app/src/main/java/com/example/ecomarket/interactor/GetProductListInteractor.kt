package com.example.ecomarket.interactor

import com.example.ecomarket.Repository
import com.example.ecomarket.model.ProductItem

class GetProductListInteractor(private val repository: Repository) {

    fun getProductList(): List<ProductItem> {
        return repository.getProductList()
    }
}