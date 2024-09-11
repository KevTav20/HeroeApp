package com.example.heroeapp.models

import android.media.Image

data class Logo(val id : Int, val name : String, val image: String){
    companion object{
        val logos = listOf(
            Logo(1, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(2, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(3, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(4, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(5, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(6, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(7, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(8, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(8, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(9, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
            Logo(10, "Spiderman", "com/example/heroeapp/models/Logo.kt:8"),
        )
    }
}
