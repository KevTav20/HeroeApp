package com.example.heroeapp.activities

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.heroeapp.R
import com.example.heroeapp.models.Character
import com.squareup.picasso.Picasso

class CharacterDetailActivity : AppCompatActivity() {
    lateinit var characterName: TextView
    lateinit var characterImageView: ImageView
    lateinit var characterPopularityTextView: TextView
    lateinit var characterDescriptionTextView: TextView
    lateinit var characterBackgroundView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_character_detail)

        characterName = findViewById(R.id.heroe_name)
        characterDescriptionTextView = findViewById(R.id.description)
        characterImageView = findViewById(R.id.heroe_image)
        characterPopularityTextView = findViewById(R.id.popularity)
        characterBackgroundView = findViewById(R.id.character_background) // Asegúrate de que este ID sea correcto

        // Obtiene el ID del personaje desde el intent
        val characterId = intent.getIntExtra("characterId", -1)

        // Busca el personaje por ID
        val character = Character.characters.firstOrNull { it.id == characterId }

        if (character != null) {
            characterName.text = character.name
            characterDescriptionTextView.text = character.description
            Picasso.get().load(character.image).into(characterImageView)
            characterPopularityTextView.text = character.popularity.toString()

            // Cambiar el texto de popularidad según su valor
            val popularityText = when {
                character.popularity >= 9.5 -> "Muy popular"
                character.popularity >= 8.0 -> "Popular"
                character.popularity >= 6.5 -> "Algo popular"
                character.popularity >= 5.0 -> "Poco popular"
                character.popularity >= 3.0 -> "No muy conocido"
                character.popularity >= 1.0 -> "Desconocido"
                else -> "Nada popular"
            }
            characterPopularityTextView.text = popularityText

            // Convierte el color hexadecimal a un valor de color y lo aplica al fondo
            try {
                val color = Color.parseColor(character.background)
                characterBackgroundView.setBackgroundColor(color)
            } catch (e: IllegalArgumentException) {
                // Manejo de error si el color es inválido
                characterBackgroundView.setBackgroundColor(Color.TRANSPARENT)  // Color de fondo por defecto
            }
        }
    }
}
