package com.dastan.firstappkotlin

import android.content.Context
import android.widget.Toast

class UIManager{
    companion object {
        fun showToast(message: String, context: Context) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}