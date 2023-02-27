package com.mrsu.rpgmaster

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class RoleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.role_layout)
        setSupportActionBar(findViewById(R.id.main_toolbar))
        val appBar: Toolbar = findViewById(R.id.main_toolbar)
    }
}