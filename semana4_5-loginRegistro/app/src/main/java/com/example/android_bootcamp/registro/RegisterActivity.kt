package com.example.android_bootcamp.registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android_bootcamp.MainActivity
import com.example.android_bootcamp.R
import com.example.android_bootcamp.login.LoginActivity
import com.example.android_bootcamp.ui.search.SearchActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RegisterActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_register)
            val aceptar = findViewById<Button>(R.id.aceptarBoton)
            val regresar = findViewById<FloatingActionButton>(R.id.regresar)
            supportActionBar?.hide()


            aceptar.setOnClickListener {
                val intent = Intent(this, SearchActivity::class.java)
                startActivity(intent)
            }
            regresar.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
}