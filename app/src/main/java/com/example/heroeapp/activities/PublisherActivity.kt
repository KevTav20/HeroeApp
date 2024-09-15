package com.example.heroeapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroeapp.MainActivity
import com.example.heroeapp.R
import com.example.heroeapp.adapters.TeamAdapter
import com.example.heroeapp.models.TeamButton
import com.example.heroeapp.models.User

class PublisherActivity : AppCompatActivity() {
    lateinit var usernameTV: TextView
    lateinit var logoutBtn: ImageView
    lateinit var teamRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publisher)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        // Inicializar las vistas
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)

        teamRecyclerView = findViewById(R.id.team_recyclerview)
        teamRecyclerView.adapter = TeamAdapter(TeamButton.teamButtons)
        teamRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        // Configurar el usuario

        val user = User.users[0]
        usernameTV.text = user.computedName

        // Acción para el botón de logout
        logoutBtn.setOnClickListener {
            Log.i("LOGOUT", "Cerrando sesión")

            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            // Navegar de regreso a MainActivity
            val intent = Intent(this@PublisherActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
