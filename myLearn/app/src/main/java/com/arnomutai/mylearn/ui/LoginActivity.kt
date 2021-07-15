package com.arnomutai.mylearn.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.arnomutai.mylearn.R

class LoginActivity : AppCompatActivity() {
    private lateinit var textMe : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textMe = findViewById(R.id.textme1)

        fun clickMe(){
            startActivity(Intent(this@LoginActivity, activityRegister::class.java))
        }

        textMe.setOnClickListener {
            clickMe()
        }
    }
}