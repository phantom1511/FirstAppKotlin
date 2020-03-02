package com.dastan.firstappkotlin.model

import java.io.Serializable

data class Purchases(
    val number: Int,
    val purchasesName: String,
    val price: Double,
    val discount: Double,
    val result: Double = price - discount
) : Serializable

fun createPurchases(): MutableList<Purchases> {
    return mutableListOf<Purchases>().apply {
        this.add(Purchases(1, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(2, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(3, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(4, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(5, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(6, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(7, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(8, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(9, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(10, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(11, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(12, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(13, "Cristiano", 5.5, 5.5, 100.5))
    }
}
