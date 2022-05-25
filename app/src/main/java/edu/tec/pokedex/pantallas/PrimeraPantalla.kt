package edu.tec.pokedex.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import edu.tec.pokedex.navegacion.NavegacionPantallas


//Crear un UI con compose, la cual modificar la tap bar
@Composable
fun PrimeraPantalla(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Pokedex")
        }
    }) {
        Detalle(navController)
    }
}

//Crear un UI con compose, la cual implementa un boton y da su style
@Composable
fun Detalle(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Primera Prantalla")
        Button(onClick = { navController.navigate(route = NavegacionPantallas.PokemonPantalla.pantallas) }) {
            Text(text = "Click para ver pokemon")
        }
    }
}

//Crear un preview para visualizar la pantalla
@Preview(showBackground = true)
@Composable
fun ListaPreview() {

    //  PrimeraPantalla()

}