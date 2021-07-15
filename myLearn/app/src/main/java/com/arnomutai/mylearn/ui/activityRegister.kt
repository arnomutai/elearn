package com.arnomutai.mylearn.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.gms.tasks.OnCompleteListener
import com.arnomutai.mylearn.R
import com.google.firebase.auth.FirebaseAuth

class activityRegister : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var btnReg: Button
    private lateinit var editTextEmail: EditText
    private lateinit var editTextpass: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()
        btnReg = findViewById(R.id.cirRegisterButton)

        btnReg.setOnClickListener {


        }
    }
}