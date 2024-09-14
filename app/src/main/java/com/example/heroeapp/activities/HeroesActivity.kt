package com.example.heroeapp.activities

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroeapp.R
import com.example.heroeapp.adapters.CharacterAdapter
import com.example.heroeapp.models.Heroes
import com.example.heroeapp.models.TeamButton

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
            dinamic_backgroundV.setBackgroundResource(R.drawable.marvel_background)

        } else if (teamId == 2) {
            dinamic_backgroundV.setBackgroundResource(R.drawable.dc_background)
        }

        characterRecycleView = findViewById(R.id.characters_recycleview)

        val filteredCharacters = when (teamId) {
            1 -> Heroes.characters.subList(0, 10) // Mostrar personajes del 1 al 10
            2 -> Heroes.characters.subList(10, 20) // Mostrar personajes del 11 al 20
            else -> emptyList() // Si no es ninguno, no mostrar personajes
        }

        // Configurar el RecyclerView con la lista filtrada
        characterRecycleView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        characterRecycleView.adapter = CharacterAdapter(filteredCharacters)

    }
}