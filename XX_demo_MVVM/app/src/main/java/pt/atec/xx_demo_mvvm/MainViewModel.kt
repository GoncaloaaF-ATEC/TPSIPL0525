package pt.atec.xx_demo_mvvm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Aluno(var nome: String)


class MainViewModel: ViewModel() {

    private val _aluno = MutableLiveData<Aluno>()

    val aluno: LiveData<Aluno>
        get() = _aluno

    val nomeAluno: String
        get() = _aluno.value?.nome.toString()

    init {
        _aluno.value = Aluno("Gonçalo 5")
    }

    fun mudarNome(nome: String = "Sem nome"){
        _aluno.value = _aluno.value?.copy(nome = nome)
        Log.d("msg", _aluno.value?.nome ?: "Sem nome")


    }



}