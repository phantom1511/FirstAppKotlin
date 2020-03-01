package com.dastan.firstappkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dastan.firstappkotlin.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userName = intent.getStringExtra("userName")
        val password = intent.getStringExtra("password")
        val message = "userName:  $userName \n password: $password"
        text.text = message
    }
}
