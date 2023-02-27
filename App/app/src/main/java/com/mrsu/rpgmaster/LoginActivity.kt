package com.mrsu.rpgmaster

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.login_layout)
        setSupportActionBar(findViewById(R.id.main_toolbar))
        val appBar: Toolbar = findViewById(R.id.main_toolbar)
        val userNameLabel: TextView = findViewById(R.id.username_textView)
        val passwordLabel: TextView = findViewById(R.id.password_textView)
        val userNameInput: TextView = findViewById(R.id.username_editText)
        val passwordInput: TextView = findViewById(R.id.password_editText)
        //TODO: No components in device. Need to solve this issue.
    }
}