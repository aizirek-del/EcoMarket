package com.example.ecomarket.domain.interactor

import com.example.ecomarket.domain.repository.ProductRepository
import com.example.ecomarket.domain.model.Category

class GetCategoryInteractor(private val repository: ProductRepository) {

    fun getCategory(categoryId: Int): List<Category> {
        return repository.getProductCategory()
    }
}