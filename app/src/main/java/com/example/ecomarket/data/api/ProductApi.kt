package com.example.ecomarket.data.api

import com.example.ecomarket.data.dto.CategoryResponse
import com.example.ecomarket.data.dto.OrderRequest
import com.example.ecomarket.data.dto.ProductResponse
import com.example.ecomarket.domain.model.OrderResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ProductApi {

    @GET("product-category-list")
   suspend fun getProductsCategory(): CategoryResponse

    @GET("product-list")
    fun getProductsList(
        @Query("category_name") categoryName: String,
        @Query("search") search: String,
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): List<ProductResponse>

    @POST("order-create")
    fun createOrder(
        @Body body: OrderRequest
    ): OrderResponse

    @GET("order-list")
    fun getOrderList():List<OrderResponse>
}