

fun main() {

    navaFunc()
    soma(1, 10)
    soma(val2 = 1, val1 = 10)

    soma(1, val2 = 10)
    soma(1, val2 = 10, 42)


    val msg = olaMundo2(2025, "Gonçalo")
    println(msg)

    val msg2 = olaMundo2(2025)
    println(msg2)


    println(olaMundo3("Carlos", 2007))


    println(olaMundo3(ano = 2007))


    println(211.ePar())


    var valEmCm = 1031
    println("$valEmCm cm em m = ${valEmCm.cmTOm()}")
}

