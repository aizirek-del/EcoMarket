package com.example.ecomarket.interactor

import com.example.ecomarket.Repository
import com.example.ecomarket.model.Category

class GetCategoryInteractor(private val repository: Repository) {

    fun getCategory(categoryId: Int): List<Category> {
        return repository.getProductCategory()
    }
}