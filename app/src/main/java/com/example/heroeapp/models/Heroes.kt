package com.example.heroeapp.models

data class Heroes(
    val id: Int,
    val name: String,
    val image: String
) {
    companion object {
        val characters = listOf(
            Heroes(1, "Spider-Man", "https://imgur.com/5VF4iUb.jpg"),
            Heroes(2, "Iron Man", "https://imgur.com/pCR0tM9.jpg"),
            Heroes(3, "Capitana Marvel", "https://imgur.com/HVWiW6L.jpg"),
            Heroes(4, "Thor", "https://imgur.com/Da5oXOG.jpg"),
            Heroes(5, "Hulk", "https://imgur.com/hzq2eBI.jpg"),
            Heroes(6, "Black Widow", "https://imgur.com/1cbuC4n.jpg"),
            Heroes(7, "Wolverine", "https://imgur.com/9X5zej0.jpg"),
            Heroes(8, "Capitán América", "https://imgur.com/bIYAtY3.jpg"),
            Heroes(9, "Deadpool", "https://imgur.com/YuxLw9U.jpg"),
            Heroes(10, "Doctor Strange", "https://imgur.com/qCeX1q9.jpg"),


            Heroes(11, "Superman", "https://imgur.com/j5uUoCc.jpg"),
            Heroes(12, "Batman", "https://imgur.com/ti4QF1h.jpg"),
            Heroes(13, "Wonder Woman", "https://imgur.com/Qn564EK.jpg"),
            Heroes(14, "Linterna Verde", "https://imgur.com/eXiSSqf.jpg"),
            Heroes(15, "Shazam", "https://imgur.com/Gi2c1fR.jpg"),
            Heroes(16, "Flash", "https://imgur.com/5Q0bxc2.jpg"),
            Heroes(17, "Nightwing", "https://imgur.com/aMXgRo3.jpg"),
            Heroes(18, "Catwoman", "https://imgur.com/iFUX9bY.jpg"),
            Heroes(19, "Flecha Verde", "https://imgur.com/9wcL0zX.jpg"),
            Heroes(20, "Batgirl", "https://imgur.com/WkeRM20.jpg")
        )
    }
}


