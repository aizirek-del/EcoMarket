package com.example.ecomarket.data.mapper

import com.example.ecomarket.data.dto.CategoryResponse
import com.example.ecomarket.domain.model.Category

fun CategoryResponse.fromNetwork(): Category {
    return Category(
        id = id,
        name = name,
        image = image
    )
}