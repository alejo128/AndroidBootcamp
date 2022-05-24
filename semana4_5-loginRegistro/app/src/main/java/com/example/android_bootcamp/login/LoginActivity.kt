package com.example.android_bootcamp.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.android_bootcamp.R
import com.example.android_bootcamp.registro.RegisterActivity
import com.example.android_bootcamp.ui.search.SearchActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val login = findViewById<Button>(R.id.loginBoton)
        val registro = findViewById<TextView>(R.id.registrarse)
        val invitado = findViewById<TextView>(R.id.invitado)
        supportActionBar?.hide()


        login.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }
        registro.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        invitado.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

    }
}