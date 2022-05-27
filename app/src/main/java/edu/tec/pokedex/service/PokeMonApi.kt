package edu.tec.pokedex.service

import edu.tec.pokedex.data.ListaPokemons
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface PokeMonApi {
    //se pone get pokemon porque al hacer un resquest le decimos que endpoint en especifico queremos consultar
    @GET("pokemon")
    suspend fun getPokemonList():ListaPokemons

    companion object{
        var apiService: PokeMonApi? = null
        fun getInstance() : PokeMonApi{
            if (apiService == null){
                apiService = Retrofit.Builder()
                    .baseUrl("https://pokeapi.co/api/v2/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(PokeMonApi::class.java)
            }
            return apiService!!

        }

    }
}