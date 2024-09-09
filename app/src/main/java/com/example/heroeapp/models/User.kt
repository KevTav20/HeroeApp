package com.example.heroeapp.models


data class User(val name:String, val email:String, val password:String){
    val computedName :String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Kevin","kevin_tavera11@yahoo.com", "1234"),
            User("Dueñas","dueñas@yahoo.com", "1234"),
            User("Natasha","natasha@yahoo.com", "1234")
        )
    }
}