package com.example.heroeapp.models

data class TeamButton(val id: Int, val name: String, val color: String, val images: List<String>) {
    val computedName :String get() = "Bienvenido a $name"
    companion object {
        val teamButtons = listOf(
            TeamButton(
                id = 1,
                color = "#C0C0C0",
                name = "Marvel",
                images = listOf(
                    "https://imgur.com/MOwtNeL.png",
                    "https://imgur.com/maNNhpE.png",
                    "https://imgur.com/AUxLfl0.png",
                    "https://imgur.com/7k5B4Yp.png",
                    "https://imgur.com/j7dZEFh.png"
                )
            ),
            TeamButton(
                id = 2,
                color = "#CD7F32",
                name = "DC",
                images = listOf(
                    "https://imgur.com/2mELoHF.png",
                    "https://imgur.com/Kiph9PB.png",
                    "https://imgur.com/aPSP9Hg.png",
                    "https://imgur.com/gKECRFT.png",
                    "https://imgur.com/KZplM4O.png"
                )
            )
        )
    }
}
