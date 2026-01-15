
fun main() {


    try {
        var alunos = Aluno("Carlos", 12)

        println(alunos.nome)
        println(alunos.idade)
        println(alunos.turma)

        alunos.turma = "TPSIPL"

        println(alunos.turma)
    }catch (e: IllegalArgumentException){

        println(e)

    }



}