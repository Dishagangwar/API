package com

data class NewData(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)