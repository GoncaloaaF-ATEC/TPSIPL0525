
// cmt 1 linha

/*

cmt
multi
linha

 */

const val PI = 3.14

fun main() {

    print("print 1\n");
    println("print 2")

    var nome2 = "Gonçalo" // var
    println(nome2)

    val idade = 30 // var imutavel

    println(idade)

    nome2 = "Novo nome"
    println(nome2)
    val turma = "TPSIPL0525"



    var ano = 2025

    var anoFinal: Int

    var soma = ano + 2.5
    println(soma)


    val notaFinal: Int

    notaFinal = 13
    println(notaFinal)


    var myString = "The Quick Brown Fox Jumps Over a Lazy Dog"

    println(myString)
    println(myString.length)
    println(myString.uppercase())
    println(myString.lowercase())

    var myString2 = "Lazy Dog"
    var myString3 = "The Quick Brown Fox Jumps Over a Lazy Dog"

    println(myString.compareTo(myString2))

    println(myString.compareTo(myString3))

    println(myString.indexOf(myString2)) // idx inicial da sub string


    var msg = "Ola Mundo"
    var nome = "Gonçalo"

    println(msg + " " + nome )

    println(msg.plus(nome))


    println("$msg $nome")


    println("msg de boas vindas: $msg $nome :Fim da msg de boas vindas")

}