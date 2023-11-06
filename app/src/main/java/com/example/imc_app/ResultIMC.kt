package com.example.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultIMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)
        val tvResult= findViewById<TextView>(R.id.tvResult)
        val name : String =  intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $name"
    }
}