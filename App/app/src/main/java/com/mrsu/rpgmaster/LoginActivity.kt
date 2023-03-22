package com.mrsu.rpgmaster

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        setSupportActionBar(findViewById(R.id.main_toolbar))

        val btnLogin = findViewById<Button>(R.id.loginButton)
        btnLogin.setOnClickListener {
            val intent = Intent(this, RoleActivity::class.java)
            startActivity(intent)
        }

        //TODO: Add "log in" mechanism on client and server
        //TODO: Add connection between roles by ws via server
    }
}