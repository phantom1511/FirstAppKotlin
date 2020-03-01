package com.dastan.firstappkotlin.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dastan.firstappkotlin.*
import com.dastan.firstappkotlin.utils.UIManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_paskhalki.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //массивы
    //есть 2 вида когда mutableListOf тогда можно будет менять добовалять удалять
    //а если ListOf то она больше не булет меняться
    val nameList = mutableListOf<String>("name", "hello", "text")
    val passList = mutableListOf<String>("123", "123456", "tex45648t")

    val namePList = mutableListOf<String>("444", "333", "222")
    val passPList = mutableListOf<String>("444", "333", "222")

    val paskhalka = listOf<String>("cr7")
    val paskhalkaPassword = listOf<String>("777")

    val paskhalka2 = listOf<String>("dastan")
    val paskhalkaPassword2 = listOf("777")

    val photos = listOf<Int>(
        R.drawable.cris1,
        R.drawable.cris2,
        R.drawable.cris3,
        R.drawable.cris4,
        R.drawable.cris5,
        R.drawable.cris6,
        R.drawable.cris7
    )
    //var ImageView:imageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainClick()
        //imageView = findViewById<ImageView>(R.id.ivRonaldo)
    }

    //fun это методы, функции
    //val не меняется а var меняется это все переменные
    //text это вызыватеся чтобы получить text это getText()
    private fun mainClick() {
        btnClick.setOnClickListener {
            val userName = etUserName.text.toString()
            val password = etPassword.text.toString()
            checkUserData(userName, password)

        }
    }

    private fun checkUserData(userName: String, password: String) {
        if (paskhalka.contains(userName) && paskhalkaPassword.contains(password))
            startActivity(Intent(this, PaskhalkaActivity::class.java))
//        else if (paskhalka2.contains(userName) && paskhalkaPassword2.contains(password))
//            startActivity(Intent(this, PaskhalkiActivity::class.java))
//            ivRonaldo.setImageResource(photos[3])

        if (namePList.contains(userName) && passPList.contains(password))
            startActivity(
                Intent(this, ThirdActivity::class.java)
                    .putExtra("condition", userName)
            )
        else UIManager.showToast(
            "ERROR",
            this
        )

        if (nameList.contains(userName) && passList.contains(password))
            startActivity(
                Intent(this, SecondActivity::class.java)
                    .putExtra("userName", userName)
                    .putExtra("password", password)
            )
        else UIManager.showToast(
            "ERROR",
            this
        )
    }
}
