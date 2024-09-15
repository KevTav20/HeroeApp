package com.example.heroeapp.models

data class Character(val id: Int, val name: String, val description: String, val image: String, val popularity: Double, val background : String){
    companion object{
        val characters = listOf(
            Character(1, "Spider-Man", "Peter Parker es un adolescente que, tras ser mordido por una araña radiactiva, adquiere habilidades como superfuerza, agilidad mejorada, la capacidad de trepar paredes y un sentido arácnido que le advierte del peligro. Bajo la identidad de Spider-Man, lucha contra el crimen mientras enfrenta los desafíos de ser un joven adulto en Nueva York.", "https://imgur.com/D4qIXhM.png", 9.8, "#660000"),
            Character(2, "Iron Man", "Tony Stark, un brillante inventor y multimillonario, crea una armadura avanzada tras sobrevivir a una experiencia cercana a la muerte. Utiliza su intelecto para mejorar la armadura, convirtiéndose en Iron Man. Con su tecnología, lucha contra amenazas globales, mientras combate sus propios demonios, incluyendo su responsabilidad por el armamento que creó.", "https://imgur.com/zbpASQ8.png", 9.7, "#705E00"),
            Character(3, "Capitana Marvel", "Carol Danvers, una ex-piloto de la Fuerza Aérea de los EE. UU., obtiene poderes sobrehumanos después de un accidente con tecnología alienígena. Como Capitana Marvel, tiene la capacidad de volar, superfuerza y la habilidad de absorber y proyectar energía. Es una de las heroínas más poderosas del universo y juega un papel crucial en la defensa de la Tierra.", "https://imgur.com/EEw41f3.png", 8.9, "#0A1172"),
            Character(4, "Thor", "Thor es el dios del trueno y heredero del trono de Asgard. Con su poderoso martillo Mjolnir, controla el trueno y el rayo. Thor es un guerrero noble pero impulsivo, que aprende la humildad mientras protege a la Tierra y los Nueve Reinos de diversas amenazas, incluyendo a su hermano adoptivo, Loki.", "https://imgur.com/2vMSYZY.png", 9.5, "#2B2B2B"),
            Character(5, "Hulk", "Bruce Banner, un brillante científico, se transforma en Hulk, una criatura gigantesca y extremadamente fuerte, cuando se enoja debido a una exposición accidental a rayos gamma. Hulk es tanto una fuerza imparable como un ser atormentado, luchando constantemente por mantener su rabia bajo control mientras busca redención por el daño que ha causado.", "https://imgur.com/Dmj9sDf.png", 6.5, "#013220"),
            Character(6, "Black Widow", "Natasha Romanoff, también conocida como Black Widow, es una espía rusa entrenada desde la infancia en las artes del combate y el espionaje. Con un pasado oscuro lleno de misiones secretas y traiciones, Natasha busca redimirse al unirse a los Vengadores y convertirse en una heroína dispuesta a arriesgarlo todo para salvar al mundo.", "https://imgur.com/RS356XV.png", 8.5, "#5C1A0F"),
            Character(7, "Wolverine", "Logan, conocido como Wolverine, es un mutante con un factor de curación regenerativa, garras retráctiles de adamantium y sentidos animales agudizados. Aunque su naturaleza violenta y su pasado trágico lo han convertido en un guerrero solitario, Wolverine encuentra un propósito al unirse a los X-Men, luchando por la aceptación y el futuro de los mutantes.", "https://imgur.com/tDwi9DF.png", 9.6, "#8B7500"),
            Character(8, "Capitán América", "Steve Rogers es un joven frágil que se somete a un experimento durante la Segunda Guerra Mundial, convirtiéndose en el supersoldado Capitán América. Armado con su escudo de vibranium, lucha por la libertad y la justicia. Aunque congelado durante décadas, despierta en el presente y continúa protegiendo el mundo con su liderazgo y convicciones inquebrantables.", "https://imgur.com/o5cQ6aq.png", 9.2, "#000080"),
            Character(9, "Deadpool", "Wade Wilson, un mercenario con un sentido del humor irreverente y sarcástico, se somete a un experimento que le otorga habilidades curativas extraordinarias, pero también lo desfigura gravemente. Como Deadpool, Wade rompe constantemente la cuarta pared, interactuando con el público mientras se embarca en misiones caóticas y violentas, todo con su estilo único y humor ácido.", "https://imgur.com/vBjmRVQ.png", 9.3, "#5C0000"),
            Character(10, "Doctor Strange", "Stephen Strange, un arrogante neurocirujano, pierde el uso de sus manos en un accidente, lo que lo lleva a buscar una cura. Durante su búsqueda, se encuentra con las artes místicas, convirtiéndose en el Hechicero Supremo. Con el poder de manipular la realidad, el tiempo y las dimensiones, Doctor Strange protege la Tierra de amenazas mágicas y místicas.", "https://imgur.com/KlQDyru.png", 1.0, "#001F3F"),



            Character(11, "Superman", "Clark Kent, nacido como Kal-El en el planeta Krypton, es enviado a la Tierra cuando su planeta está a punto de ser destruido. Criado por una familia humana, Clark desarrolla superpoderes bajo el sol amarillo de la Tierra, incluyendo superfuerza, vuelo y visión de calor. Como Superman, se convierte en el protector de la humanidad y el símbolo de esperanza.", "https://imgur.com/qmKsCt4.png", 9.9, "#1A1F7D"),
            Character(12, "Batman", "Bruce Wayne, traumatizado por el asesinato de sus padres cuando era niño, jura luchar contra el crimen en Gotham City. Sin superpoderes, pero con una fortuna y una mente brillante, Bruce adopta la identidad de Batman, utilizando gadgets avanzados, habilidades detectivescas y un intenso entrenamiento físico para derrotar a los criminales más peligrosos de la ciudad.", "https://imgur.com/ZfVmW6c.png", 9.7, "#3A3A3A"),
            Character(13, "Wonder Woman", "Diana Prince es una princesa amazona y una guerrera entrenada desde su infancia. Dotada de habilidades sobrehumanas, incluyendo fuerza, agilidad y longevidad, y equipada con el lazo de la verdad y sus brazaletes indestructibles, Wonder Woman lucha por la justicia y la paz, tanto en el mundo de los humanos como en el de los dioses.", "https://imgur.com/bSZJfJG.png", 9.5, "#4B0000"),
            Character(14, "Linterna Verde", "Hal Jordan es un piloto de pruebas que recibe un anillo de poder de un alienígena moribundo. Como miembro de los Green Lantern Corps, una fuerza intergaláctica que protege el universo, Hal utiliza el poder de su anillo para crear construcciones de energía pura, y es responsable de mantener el orden en su sector del espacio.", "https://imgur.com/zELr8eP.png", 8.3, "#0B3B0B"),
            Character(15, "Shazam", "Billy Batson, un niño huérfano, recibe el poder de transformarse en un adulto con habilidades de los dioses cuando pronuncia la palabra 'Shazam'. Con la sabiduría de Salomón, la fuerza de Hércules, la resistencia de Atlas, el poder de Zeus, el coraje de Aquiles y la velocidad de Mercurio, Shazam lucha contra las fuerzas del mal mientras navega la vida como un niño.", "https://imgur.com/mIe52L0.png", 5.0, "#4B0000"),
            Character(16, "Flash", "Barry Allen, un científico forense, adquiere la capacidad de moverse a supervelocidad después de un accidente con partículas aceleradas. Como Flash, el hombre más rápido del mundo, Barry utiliza su velocidad para luchar contra el crimen, viajar en el tiempo y las dimensiones, y proteger Central City y el mundo de amenazas metahumanas y más allá.", "https://imgur.com/1bHMg7O.png", 3.0, "#520000"),
            Character(17, "Nightwing", "Dick Grayson, el primer compañero de Batman conocido como Robin, crece y adopta una nueva identidad como Nightwing. Independiente y carismático, continúa luchando contra el crimen, demostrando que no necesita estar bajo la sombra de Batman. Con un estilo de lucha acrobático y sus fieles bastones, Nightwing protege a los inocentes y enfrenta a los villanos más duros.", "https://imgur.com/WuUS101.png", 8.4, "#2F2F2F"),
            Character(18, "Catwoman", "Selina Kyle, una ladrona de guante blanco y experta en combate, es conocida como Catwoman. Aunque a menudo tiene intereses propios, sus caminos cruzan constantemente con Batman, lo que resulta en una relación complicada de atracción y rivalidad. Como una antiheroína, Catwoman lucha por la justicia de su manera, protegiendo a los inocentes mientras desafía las reglas.", "https://imgur.com/n6HNRNC.png", 8.6, "#2B2B2B"),
            Character(19, "Flecha Verde", "Oliver Queen, un millonario que quedó varado en una isla, aprendió a sobrevivir y perfeccionó sus habilidades con el arco. Al regresar a la civilización, adopta la identidad de Flecha Verde, un justiciero que lucha contra la corrupción y el crimen, tanto con su arco y flechas especializadas como con su ingenio y recursos.", "https://imgur.com/15jFJrU.png", 8.5, "#2E8B57"),
            Character(20, "Batgirl", "Barbara Gordon, hija del comisionado de policía de Gotham, adopta la identidad de Batgirl para luchar contra el crimen. A pesar de los desafíos personales, incluida una lesión que la dejó parapléjica durante un tiempo, Barbara sigue siendo una heroína clave en Gotham, utilizando su intelecto, habilidades de lucha y conocimientos informáticos para combatir a los criminales.", "https://imgur.com/nRJl181.png", 8.4, "#8A2BE2")
        )
    }
}
