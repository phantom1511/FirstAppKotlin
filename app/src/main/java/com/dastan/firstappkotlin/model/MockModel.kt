package com.dastan.firstappkotlin.model

import java.util.*

data class MockModel(
    val id: Long,
    val name: String,
    val lastname: String,
    val uiid: String
) {
    fun createMockModel(): MutableList<MockModel> {
//        val list = mutableListOf<MockModel>()
//        list.add(MockModel(1, "Cristiano", "Ronaldo", "1"))
//        list.add(MockModel(2, "Dastan", "Tulokulov", "1"))
//        list.add(MockModel(3, "Hyn Min", "Son", "1"))
//        list.add(MockModel(4, "Cristiano", "Ronaldo", "1"))
//        return list

        return mutableListOf<MockModel>().apply {
            this.add(MockModel(1, "Cristiano", "Ronaldo", "1"))
            this.add(MockModel(2, "Dastan", "Tulokulov", "1"))
            this.add(MockModel(3, "Hyn Min", "Son", "1"))
            this.add(MockModel(4, "Cristiano", "Ronaldo", "1"))
        }
    }
}


