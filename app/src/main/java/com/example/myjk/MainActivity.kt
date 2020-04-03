package com.example.myjk

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe() {
        val myToast = Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT)
        myToast.show()

    }
}
