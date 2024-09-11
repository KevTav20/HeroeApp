package com.example.heroeapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.heroeapp.activities.PublisherActivity
import com.example.heroeapp.models.User
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var emailEditText: EditText
    lateinit var passwordEditText: EditText
    lateinit var loginBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)

        if (isLogged){
            val intent = Intent(this@MainActivity, PublisherActivity::class.java)
            startActivity(intent)
            finish()
        }
        emailEditText = findViewById(R.id.emailET)
        passwordEditText = findViewById(R.id.passwordET)
        loginBtn = findViewById(R.id.loginBtn)
        loginBtn.setOnClickListener { v ->
            Log.i("Login", "Iniciando sesion")
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            Log.i("Email", email)
            Log.i("Password", password)

            if (password.isEmpty() || email.isEmpty()){
                Log.i("LOGIN_ERROR", "Email o password estan vacios")
                Snackbar.make(v, "El correo o la contraseña estan incorrectos", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val isValidUser = User.users.any {
                user -> user.email == email && user.password == password
            }

            if(!isValidUser){
                Log.i("LOGIN_ERROR", "Inicio correcto")
                Snackbar.make(v,"El correo o la contraseña son icorrectas", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Log.i("VALID_USER", isValidUser.toString())
            Log.i("LOGIN_SUCCESFUL", "Inicio de sesion correcto")


            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.apply()
            val intent = Intent(this@MainActivity, PublisherActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}