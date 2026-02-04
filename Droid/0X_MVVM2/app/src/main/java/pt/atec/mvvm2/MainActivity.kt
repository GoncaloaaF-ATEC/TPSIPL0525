package pt.atec.mvvm2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import pt.atec.mvvm2.ui.theme.MVVM2Theme

class MainActivity : ComponentActivity() {
    private val viewModel: mainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            val state by viewModel.uiState.collectAsStateWithLifecycle()

            Column {
                Spacer(Modifier.size(
                    height = 40.dp,
                    width = 40.dp
                ))
                Text(state.nome)

                TextField(
                    value = state.nomeTF,
                    onValueChange = viewModel::onNomeTFChange
                )


                Button(
                    onClick = viewModel::mudarNome,
                    enabled = state.isActive
                ) {

                    Text("mudar nome")

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}