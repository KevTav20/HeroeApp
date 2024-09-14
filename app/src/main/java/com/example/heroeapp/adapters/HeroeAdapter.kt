package com.example.heroeapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroeapp.R
import com.example.heroeapp.models.Heroes
import com.squareup.picasso.Picasso

class CharacterAdapter(val characterList : List<Heroes>) : RecyclerView.Adapter<CharacterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent, false)
        return CharacterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return characterList.count()
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characterList[position]
        holder.characterNameTV.text = character.name
        Picasso.get().load(character.image).into(holder.characterImage)
    }

}

class CharacterViewHolder(val view : View) : RecyclerView.ViewHolder(view){
    val characterNameTV : TextView = view.findViewById(R.id.character_name)
    val characterImage : ImageView = view.findViewById(R.id.character_image)
}