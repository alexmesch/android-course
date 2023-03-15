package com.mrsu.rpgmaster

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class RoleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.role_layout)
        setSupportActionBar(findViewById(R.id.main_toolbar))
    }
}