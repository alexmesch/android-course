package com.mrsu.rpgmaster

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class CharacterMenuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.session_menu_layout)

        setSupportActionBar(findViewById(R.id.main_toolbar))

        //TODO: Add characters list with DB storage
        //TODO: Add character info/management activity
    }
}