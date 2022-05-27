package edu.tec.pokedex.mvvm

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.tec.pokedex.data.Result
import edu.tec.pokedex.service.PokeMonApi
import kotlinx.coroutines.launch

class PokemonViewModel: ViewModel() {
    var listaPokemons : List<Result> by mutableStateOf(listOf())
    var errorMessage : String by mutableStateOf("")

    fun getPokemons(){
        //sirve para que cuando ya no se utilice el viewmodel no utilice los recursos.
        viewModelScope.launch {
            val apiService =PokeMonApi.getInstance()
            try {
                val pokemons= apiService.getPokemonList()
                listaPokemons=pokemons.results
                Log.i("Pokedex",listaPokemons.toString())
            }
            catch (e: Exception){
                errorMessage=e.message.toString()
            }
        }
    }
}