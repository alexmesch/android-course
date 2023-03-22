package com.mrsu.rpgmaster

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class RoleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.role_layout)

        setSupportActionBar(findViewById(R.id.main_toolbar))

        val btnSession = findViewById<Button>(R.id.session_button)
        btnSession.setOnClickListener {
            val intent = Intent(this, SessionMenuActivity::class.java)
            startActivity(intent)
        }

        val btnCharacter = findViewById<Button>(R.id.character_button)
        btnCharacter.setOnClickListener {
            val intent = Intent(this, CharacterMenuActivity::class.java)
            startActivity(intent)
        }

        //TODO: Add role determination on client and server
        //TODO: Add connection between roles by ws via server
    }
}