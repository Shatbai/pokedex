package edu.tec.pokedex.pantallas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

//Crear un UI con compose, la cual modificar la tap bar
//Agrega un icono y da estilo
@Composable
fun PokemonsPantalla(navController: NavController){
    Scaffold(topBar =  {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back",
                modifier = Modifier.clickable {
                    //lo que hace es quitar la parte superior de la pila por lo que se revierte la transaccion
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Pokedex List")
        }

    }){
        Pokemones()
    }
}

@Composable
fun Pokemon(name:String){
    val expanded = remember{
        mutableStateOf( false)}
    val extraPadding = if (expanded.value) 48.dp else 0.dp
    //Es creado por o consumidor de imagenes y se le da a algun producer para dibujar en el.
    Surface(color = MaterialTheme.colors.primary, modifier =  Modifier.padding(vertical = 5.dp,horizontal = 10.dp)) {
     // Permite ponerlo en filas con el surface
      Row(modifier = Modifier.padding(25.dp)) {
          Row(modifier = Modifier.padding(25.dp)) {
              Column {
                  Modifier
                      .weight(1f)
                      .padding(
                          bottom = extraPadding
                      )}
              Text( text = "Pokemon: ")
              Text(text = name)
          }
          //Un boton que sirve para mostrar un estilo de boton diferente que permite cancelar acciones
          OutlinedButton(onClick = {! expanded.value}) {
              Text(if(expanded.value)"hide" else "catch")
          }

      }
    }
}

@Composable
private fun Pokemones(cameos: List<String> = List(10){"$it"}){
   val scrollState = rememberScrollState()
    Column(modifier = Modifier
        .padding(vertical = 5.dp)
        .verticalScroll(scrollState)) {

        for (cameo in cameos){
            Pokemon(name = cameo)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ListaaPreview() {

    //PokemonsPantalla(navController = )

}