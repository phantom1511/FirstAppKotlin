package com.dastan.firstappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainClick()
    }

    //массивы
    //есть 2 вида когда mutableListOf тогда можно будет менять добовалять удалять
    //а если ListOf то она больше не булет меняться
    val nameList = mutableListOf<String>("name", "hello", "text")
    val passList = mutableListOf<String>("123", "123456", "tex45648t")

    val paskhalka = listOf<String>("cr7")
    val paskhalkaPassword = listOf<String>("777")

    //fun это методы, функции
    //val не меняется а var меняется это все переменные
    //text это вызыватеся чтобы получить text это getText()
    private fun mainClick() {
        btnClick.setOnClickListener {
            val userName = etUserName.text.toString()
            val password = etPassword.text.toString()
            //UIManager.showToast("${etUserName.text} ${etPassword.text}", this )
            checkUserData(userName, password)

        }
    }

    private fun  checkUserData(userName: String, password: String){
       if(nameList.contains(userName) && passList.contains(password))
           startActivity(Intent(this, SecondActivity::class.java)
               .putExtra("userName", userName)
               .putExtra("password", password))
        else if (paskhalka.contains(userName) && paskhalkaPassword.contains(password))
            startActivity(Intent(this, PaskhalkaActivity::class.java))
        else UIManager.showToast("ERROR", this)
    }
}
