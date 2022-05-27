package edu.tec.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.tec.pokedex.navegacion.NavegacionApp
import edu.tec.pokedex.ui.theme.PokedexTheme


// Considero que  debemos hacerlo en la parte de carrito que es donde hay más elementos y constrains
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavegacionApp()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PokedexTheme {
        Greeting("Android")
    }
}
/*Para la lista se necesitan:
¿definir un renglón en xml? Si se requiere
¿tener una clase Adapter y una clase ViewHolder? Si se necesita el view holderpara el renglon y ara pasarlo el adapter
¿Se requiere de una lista de datos? Si si la necesita
¿en qué hilo se crea la lista? se crea en la data
*/
