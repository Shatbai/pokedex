package edu.tec.pokedex.navegacion

//Es un clase que hace herecia con un identificador unico para poder saber que tipo de clase hijo es a la clase padre
sealed class NavegacionPantallas(val pantallas: String){
    object PrimeraPantalla: NavegacionPantallas("primera_pantalla")
    object PokemonPantalla: NavegacionPantallas("pokemon_pantalla")
}
