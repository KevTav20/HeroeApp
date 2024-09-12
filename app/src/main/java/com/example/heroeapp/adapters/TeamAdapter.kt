package com.example.heroeapp.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroeapp.R
import com.example.heroeapp.models.TeamButton
import com.squareup.picasso.Picasso

class TeamAdapter(val teamButtonList: List<TeamButton>) : RecyclerView.Adapter<TeamButtonViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamButtonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.team_item, parent, false)
        return TeamButtonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return teamButtonList.count()
    }

    override fun onBindViewHolder(holder: TeamButtonViewHolder, position: Int) {
        val team = teamButtonList[position]


        holder.teamBtn.setBackgroundColor(android.graphics.Color.parseColor(team.color))


        Picasso.get().load(team.images[0]).into(holder.logo1IV)
        Picasso.get().load(team.images[1]).into(holder.logo2IV)
        Picasso.get().load(team.images[2]).into(holder.logo3IV)
        Picasso.get().load(team.images[3]).into(holder.logo4IV)
        Picasso.get().load(team.images[4]).into(holder.logo5IV)

        holder.teamBtn.setOnClickListener {

            Log.i("PUSH_BUTTON","Botón del TeamButton con id: ${team.id} clickeado")
        }
    }

}

class TeamButtonViewHolder(val view: View) : ViewHolder(view){
    val teamBtn: Button = view.findViewById(R.id.team_section)
    val logo1IV : ImageView = view.findViewById(R.id.image1)
    val logo2IV : ImageView = view.findViewById(R.id.image2)
    val logo3IV : ImageView = view.findViewById(R.id.image3)
    val logo4IV : ImageView = view.findViewById(R.id.image4)
    val logo5IV : ImageView = view.findViewById(R.id.image5)
}