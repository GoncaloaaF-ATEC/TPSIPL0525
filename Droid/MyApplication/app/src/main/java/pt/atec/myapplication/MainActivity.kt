package pt.atec.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.atec.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var nome = remember {
                mutableStateOf("Gonçalo")
            }

            var text by rememberSaveable { mutableStateOf("") }
            Column {

                Text("Ola 1", modifier = Modifier.padding(top = 40.dp))
                Text("Ola 2", modifier = Modifier.padding())
                Text(nome.value,
                    fontSize = 40.sp,
                    fontFamily = FontFamily.Monospace,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,

                    )
                Spacer(modifier = Modifier.height(20.dp))
                Row {

                    Text("Ola 4 1")
                    Text("Ola 4 2")
                    Text("Ola 4 3")

                }

                TextField(text, onValueChange = { text = it })


                Button(onClick = {
                    nome.value = text
                    Log.d("lbl", nome.value)
                }) {

                    Text("1º btn")
                }
            }

        }// setContent
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}