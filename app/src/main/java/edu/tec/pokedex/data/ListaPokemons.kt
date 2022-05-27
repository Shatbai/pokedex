package edu.tec.pokedex.data

data class ListaPokemons(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)