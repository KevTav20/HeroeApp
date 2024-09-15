package com.example.heroeapp.adapters

import android.graphics.Color
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroeapp.R
import com.example.heroeapp.models.Character
import com.squareup.picasso.Picasso

class CharacterAdapter (val characterList : List<Character>, val onClick : (Character) -> Unit) : RecyclerView.Adapter<CharacterViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent, false)
        return CharacterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return characterList.count()
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characterList[position]
        holder.characterName.text = character.name
        Picasso.get().load(character.image).into(holder.characterImage)
        holder.characterDescription.text = character.description

        val color = Color.parseColor(character.background)
        holder.characterBackgroundView.setBackgroundColor(color)
        holder.itemView.setOnClickListener {
            Log.i("AdapterCharacter", "Se presiono personaja: ${character.name}")
            onClick(character)
        }
    }

}

class CharacterViewHolder(view : View) : ViewHolder(view){
    val characterName : TextView = view.findViewById(R.id.heroe_name)
    val characterImage : ImageView = view.findViewById(R.id.heroe_image)
    val characterDescription: TextView = view.findViewById(R.id.description)
    val characterPopularity: TextView = view.findViewById(R.id.popularity)
    val characterBackgroundView : View = view.findViewById(R.id.character_background)
}