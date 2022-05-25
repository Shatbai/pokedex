package edu.tec.pokedex.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.tec.pokedex.pantallas.PokemonsPantalla
import edu.tec.pokedex.pantallas.PrimeraPantalla


@Composable
fun NavegacionApp(){
    //Permite que siempre devuelva el mismo navController y no otro
    val navController = rememberNavController()
    //Define el grafo de navegación. Le decimos qué navController va a usar, la pantalla de origen, y las pantallas a las que se puede navegar.
    NavHost(navController = navController, startDestination = NavegacionPantallas.PrimeraPantalla.pantallas){
        composable(route = NavegacionPantallas.PrimeraPantalla.pantallas){

            PrimeraPantalla(navController = navController)
        }
        composable(route = NavegacionPantallas.PokemonPantalla.pantallas){
            PokemonsPantalla(navController = navController)
        }
    }
}