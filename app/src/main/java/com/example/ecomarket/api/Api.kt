package com.example.ecomarket.api

import com.example.ecomarket.api.model.CategoryResponse
import com.example.ecomarket.api.model.OrderResponse
import com.example.ecomarket.api.model.ProductResponse
import retrofit.http.Body
import retrofit.http.GET
import retrofit.http.POST
import retrofit.http.Query

interface Api {

    @GET("product-category-list")
    fun getProductsCategory(): List<CategoryResponse>

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