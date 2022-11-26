package com.example.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {

    private lateinit var editMail:EditText
    private lateinit var editPassword:EditText
    private lateinit var btnlogin:Button
    private lateinit var btnsignup:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editMail= findViewById(R.id.ent_Email)
        editPassword= findViewById(R.id.edt_password)
        btnlogin=findViewById(R.id.idloginB)
        btnsignup=findViewById(R.id.idSignB)

        btnsignup.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}