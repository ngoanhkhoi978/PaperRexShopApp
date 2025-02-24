package com.example.paperrexshopapp.data

data class Product(
    val name:String,
    val price: Double,
    val productFeatures: List<String>,
    val description: String,
    val images: List<String>,
    val colors: List<String>? = null
)
