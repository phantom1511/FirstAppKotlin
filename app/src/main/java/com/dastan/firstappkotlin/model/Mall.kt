package com.dastan.firstappkotlin.model

import java.util.*

data class SalesModel(
    val storeName: String,
    val date: Date,
    val list: List<Purchases>
    //val amount: Double
)