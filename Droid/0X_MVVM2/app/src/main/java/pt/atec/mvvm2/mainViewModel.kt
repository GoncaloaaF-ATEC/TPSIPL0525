package pt.atec.mvvm2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

data class UiState(
    val nome: String = "Gonçalo",
    val nomeTF: String = ""
){
    val isActive: Boolean = (nome != nomeTF) && (!nomeTF.isEmpty())

}


class mainViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState


    fun onNomeTFChange(novoNome: String){
        _uiState.update { it.copy(nomeTF = novoNome) }
    }

    fun mudarNome(){

        _uiState.update { it.copy(nome = it.nomeTF, nomeTF = "" ) }

    }

}


/*


Pessoa <- Base Class
Aluno <- Pessoa
Professor <- Pessoa


Aluno X = new Aluno();
Aluno X2 = new Aluno();

Professor P = new Professor()
Professor P1 = new Professor()


lista = [X, X1, P, P1]


Pessoa p = new Aluno()


 */