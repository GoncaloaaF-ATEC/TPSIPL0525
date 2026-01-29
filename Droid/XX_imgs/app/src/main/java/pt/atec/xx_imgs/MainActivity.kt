package pt.atec.xx_imgs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.atec.xx_imgs.ui.theme.XX_imgsTheme

data class Prato(val nome: String, val preco: Int, val imgagem: Int)

class MainActivity : ComponentActivity() {

    val prato = Prato("Salada de Atum", 10,R.drawable.img )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {



            Column(
                Modifier.fillMaxSize()
            ) {

                Row(verticalAlignment = Alignment.CenterVertically) {

                    Image(painter = painterResource(prato.imgagem),
                        contentDescription = prato.nome,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.
                        padding(top = 20.dp, start = 20.dp).
                        size(80.dp, 80.dp).
                        clip(CircleShape).
                        border(2.dp, Color.Red,CircleShape )
                    )

                    Column {
                        Text(prato.nome,
                            fontWeight = FontWeight.Bold,

                            modifier = Modifier
                                .padding(start = 20.dp),
                            style = MaterialTheme.typography.bodyLarge

                        )

                        Text("${prato.preco}€",
                            modifier = Modifier
                                .padding(start = 20.dp, top = 5.dp),

                        style = MaterialTheme.typography.labelMedium
                        )


                    }





                }


            }

        }// setContent
    }// onCreate
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}