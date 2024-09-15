package com.example.heroeapp.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroeapp.R
import com.example.heroeapp.models.Heroe
import com.squareup.picasso.Picasso

class HeroeAdapter(val heroeList : List<Heroe>, val onClick: (Heroe) -> Unit) : RecyclerView.Adapter<HeroeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent, false)
        return HeroeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroeList.count()
    }

    override fun onBindViewHolder(holder: HeroeViewHolder, position: Int) {
        val heroe = heroeList[position]
        holder.characterNameTV.text = heroe.name
        Picasso.get().load(heroe.image).into(holder.characterImage)
        holder.itemView.setOnClickListener {
            Log.i("HeroesAdapter", "Presionaste el heroe: ${heroe.name}")
            onClick(heroe)
        }
    }

}

class HeroeViewHolder(val view : View) : RecyclerView.ViewHolder(view){
    val characterNameTV : TextView = view.findViewById(R.id.character_name)
    val characterImage : ImageView = view.findViewById(R.id.character_image)
}