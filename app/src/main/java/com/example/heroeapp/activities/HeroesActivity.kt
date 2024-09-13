package com.example.heroeapp.activities

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroeapp.R

class HeroesActivity : AppCompatActivity() {
    lateinit var dinamic_backgoundV : View
    lateinit var welcome_teamTV : TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)

        val dinamic_backgroundV = findViewById<View>(R.id.dinamic_backgound)
        val teamId = intent.getIntExtra("TEAM_ID", -1)

        // Cambiar el fondo de dinamic_background dependiendo del ID del equipo
        if (teamId == 1) {
            // Fondo para Marvel
            dinamic_backgroundV.setBackgroundResource(R.drawable.marvel_background)
        } else if (teamId == 2) {
            // Fondo para DC
            dinamic_backgroundV.setBackgroundResource(R.drawable.dc_background)
        }
    }
}