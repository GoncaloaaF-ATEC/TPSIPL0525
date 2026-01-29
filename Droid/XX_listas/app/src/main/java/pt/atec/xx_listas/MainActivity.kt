package pt.atec.xx_listas

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    val nomes = listOf(
        "Gonçalo", "João", "Ana", "Maria", "Pedro",
        "Rita", "Miguel", "Sofia", "Tiago", "Inês",
        "Bruno", "Carla", "André",  "Beatriz",  "Luís",
        "Catarina", "Daniel","Marta","Ricardo", "Patrícia"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lista(myList = nomes,
            onClick = { arg1, arg2 ->

                    Log.d(arg1, "o nome tem $arg2 letras")
            })
        } // setContent
    } // onCreate
}


@Composable
fun Lista(myList: List<String>, onClick: (String, Int) -> Unit ) {

    LazyColumn(modifier = Modifier.padding(vertical = 15.dp)){
        items(myList) { nome ->
            Box(contentAlignment = Alignment.TopCenter , modifier = Modifier
                .fillMaxWidth()
                .clickable{
                    onClick(nome,nome.length)
                }
                .padding(vertical = 30.dp, horizontal = 16.dp)
            ) {

                Text(nome,
                    style = MaterialTheme.typography.bodyLarge

                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}