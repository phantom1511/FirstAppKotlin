package com.dastan.firstappkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dastan.firstappkotlin.R
import com.dastan.firstappkotlin.model.MockModel
import com.dastan.firstappkotlin.model.Purchases
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    val namePList = mutableListOf<String>("444", "333", "222")
    val passPList = mutableListOf<String>("444", "333", "222")
    val adapter: Adapter = Adapter(mutableListOf<Purchases>().apply {
        this.add(Purchases(1, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(2, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(3, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(4, "Cristiano", 5.5, 5.5, 100.5))
        this.add(Purchases(5, "Cristiano", 5.5, 5.5, 100.5))
    })

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
