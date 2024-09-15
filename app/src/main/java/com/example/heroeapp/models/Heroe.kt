package com.example.heroeapp.models

data class Heroe(
    val id: Int,
    val name: String,
    val image: String
) {
    companion object {
        val heroes = listOf(
            Heroe(1, "Spider-Man", "https://imgur.com/5VF4iUb.jpg"),
            Heroe(2, "Iron Man", "https://imgur.com/pCR0tM9.jpg"),
            Heroe(3, "Capitana Marvel", "https://imgur.com/HVWiW6L.jpg"),
            Heroe(4, "Thor", "https://imgur.com/Da5oXOG.jpg"),
            Heroe(5, "Hulk", "https://imgur.com/hzq2eBI.jpg"),
            Heroe(6, "Black Widow", "https://imgur.com/1cbuC4n.jpg"),
            Heroe(7, "Wolverine", "https://imgur.com/9X5zej0.jpg"),
            Heroe(8, "Capitán América", "https://imgur.com/bIYAtY3.jpg"),
            Heroe(9, "Deadpool", "https://imgur.com/YuxLw9U.jpg"),
            Heroe(10, "Doctor Strange", "https://imgur.com/qCeX1q9.jpg"),


            Heroe(11, "Superman", "https://imgur.com/j5uUoCc.jpg"),
            Heroe(12, "Batman", "https://imgur.com/ti4QF1h.jpg"),
            Heroe(13, "Wonder Woman", "https://imgur.com/Qn564EK.jpg"),
            Heroe(14, "Linterna Verde", "https://imgur.com/eXiSSqf.jpg"),
            Heroe(15, "Shazam", "https://imgur.com/Gi2c1fR.jpg"),
            Heroe(16, "Flash", "https://imgur.com/5Q0bxc2.jpg"),
            Heroe(17, "Nightwing", "https://imgur.com/aMXgRo3.jpg"),
            Heroe(18, "Catwoman", "https://imgur.com/iFUX9bY.jpg"),
            Heroe(19, "Flecha Verde", "https://imgur.com/9wcL0zX.jpg"),
            Heroe(20, "Batgirl", "https://imgur.com/WkeRM20.jpg")
        )
    }
}


