package pt.atec.a0x_apis

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _cmt = MutableLiveData<Coment>()

    val nome: String
        get() = _cmt.value?.name.toString()

    val email: String
        get() = _cmt.value?.email.toString()


    fun setCmt(cmt: Coment){
        _cmt.value = cmt
    }

}