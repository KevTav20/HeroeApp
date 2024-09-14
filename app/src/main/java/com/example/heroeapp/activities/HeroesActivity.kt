package com.example.heroeapp.activities

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroeapp.R
import com.example.heroeapp.adapters.CharacterAdapter
import com.example.heroeapp.models.Character
import com.example.heroeapp.models.TeamButton
import com.example.heroeapp.models.User

class HeroesActivity : AppCompatActivity() {
    lateinit var dinamic_backgoundV : View
    lateinit var dinamic_welcomeTV : TextView
    lateinit var characterImage: ImageView
    lateinit var characterNameTextView: TextView
    lateinit var characterRecycleView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)

        val dinamic_backgroundV = findViewById<View>(R.id.dinamic_backgound)
        val teamId = intent.getIntExtra("TEAM_ID", -1)
        val team = TeamButton.teamButtons.find { it.id == teamId }
        dinamic_welcomeTV = findViewById(R.id.dinamic_welcome)

        if (team != null) {
            dinamic_welcomeTV.text = team.computedName
        }

        if (teamId == 1) {
            // Fondo para Marvel
            dinamic_backgroundV.setBackgroundResource(R.drawable.marvel_background)

        } else if (teamId == 2) {
            // Fondo para DC
            dinamic_backgroundV.setBackgroundResource(R.drawable.dc_background)
        }

        characterRecycleView = findViewById(R.id.characters_recycleview)
        characterRecycleView.adapter = CharacterAdapter(Character.characters)
        characterRecycleView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }
}