package com.example.ecomarket.data.dto

import com.google.gson.annotations.SerializedName

data class CategoryResponse(
     @SerializedName("id")
     val id: Int,
     @SerializedName("name")
     val name: String,
     @SerializedName("image")
     val image: String
 )