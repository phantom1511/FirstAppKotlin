package com.dastan.firstappkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dastan.firstappkotlin.R
import com.dastan.firstappkotlin.model.MockModel
import com.dastan.firstappkotlin.model.Purchases
import com.dastan.firstappkotlin.model.createPurchases
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    val namePList = mutableListOf<String>("444", "333", "222")
    val passPList = mutableListOf<String>("444", "333", "222")
    val adapter: Adapter = Adapter(createPurchases())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        rvProduct.adapter = adapter
//        val text = intent?.getStringExtra("condition")
//
//        val textColor = when (text){
//            "444" -> resources.getColor(R.color.colorAccent)
//            else -> resources.getColor(R.color.colorPrimaryDark)
//        }
//        tvThird.setTextColor(textColor)
//        tvThird.text = text
//
//        var textLoop: String = ""
//        for (i in 0 until 10 step 2){
//            textLoop += " $i "
//        }

//        val list = createMockModel()
//        val str = ""
//        for (i in 0 until list.size){
//            str += "name = ${list[i].name}, id = ${list[i].id}, uiid = ${list[i].uiid}"
//        }
    }
}
