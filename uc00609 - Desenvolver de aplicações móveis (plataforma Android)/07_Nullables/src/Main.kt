

fun main() {
    var nome: String? = "Gonçalo"
    println(nome?.length ?: -1)

    nome = null
    println(nome?.length ?: "sem valor")


    nome = "Joao"
    println(nome)




    nome = null
    var x = nome?.length ?: "sem valor"
    println(x::class.simpleName)


    nome = "Carlos"
    x = nome?.length ?: "sem valor"
    println(x::class.simpleName)


    nome = "Ana Maria"
    println(nome!!.length)


    nome = null
    nome?.let { println("Ola ${it} o tem nome tem ${it.length} letras") }




}