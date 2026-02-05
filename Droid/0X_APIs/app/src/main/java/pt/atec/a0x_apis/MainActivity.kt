package pt.atec.a0x_apis

import android.os.Bundle
import android.util.Log

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 *
 *  tenho uma lists com 100 000 de entradas, quero mostrar 20 de vez.
 *
 *  qual como fazem o request API
 *
 *  /produto?categoria=""&page=1&limit=20
 *
 *
 */
class MainActivity : ComponentActivity() {

    var vm = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(Modifier.fillMaxSize(),
                verticalArrangement =  Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {


                Button(onClick = {

                    Log.d("demo 1", "todos - Inicio ")

                    getAllComments()

                    Log.d("demo 1", "todos - Fim ")
                }) {

                    Text("Load all Comments")

                }


                Button(onClick = {
                    Log.d("demo 1", "1 cmt - Inicio ")

                  getCommnet(5)

                    Log.d("demo 1", "1 cmt  - Fim ")

                }) {

                    Text("Load 1 Comment")

                }


            } //Column
        } //setContent
    }
}



fun getAllComments(){
    Log.d("demo 1 - fun", "2 todos - Inicio ")

    var api = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(APIHandler::class.java)

    Log.d("demo 1 - fun", "3 Retrofit.Builder() - Done ")
    Log.d("demo 1 - fun", "4 leitura dos dados  ")

    api.getAllComments().enqueue(object : Callback<List<Coment>>{
        override fun onResponse(
            call: Call<List<Coment>>,
            response: Response<List<Coment>>
        ) {
            if (response.isSuccessful){
                Log.d("demo 1 - fun","5: inicio isSuccessful")

                    response.body()?.let {
                        for (cmt in it){
                            Log.d("showData - fun",cmt.email)

                        }
                    }

                Log.d("demo 1 - fun","6: fim isSuccessful")
            }

        }//onResponse

        override fun onFailure(
            call: Call<List<Coment>?>,
            t: Throwable
        ) {
            Log.d("demo 1 - fun","5: Erro: ${t.message}")
        } //onFailure


    } //Callback<List<Coment>>{
    )//  api.getAllComments().enqueue





    Log.d("demo 1 - fun", "todos - Fim ")
}


fun getCommnet(id: Int){}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}