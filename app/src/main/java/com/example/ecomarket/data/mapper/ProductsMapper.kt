package com.example.ecomarket.data.mapper

import com.example.ecomarket.data.dto.CategoryResponse
import com.example.ecomarket.domain.model.Category

object ProductsMapper {
    fun fromNetwork(category: CategoryResponse): Category {
        return Category(
            id = category.id,
            name = category.name,
            image = category.image
        )
    }
}