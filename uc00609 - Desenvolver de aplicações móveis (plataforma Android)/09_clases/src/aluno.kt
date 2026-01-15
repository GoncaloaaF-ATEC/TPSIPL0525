class Aluno(private var _nome: String, private var _idade: Int, private var _turma: String? = null){

    init {
        require(_idade >= 18)
    }

    var nome: String
        get() = _nome
        set(nome) {
            _nome = nome
        }

    var idade: Int
        get() = _idade
        set(idade) {
            _idade = idade
        }


    var turma: String
        get() = _turma ?: "Sem turma"
        set(novaTurma) {
            _turma = novaTurma
        }



}