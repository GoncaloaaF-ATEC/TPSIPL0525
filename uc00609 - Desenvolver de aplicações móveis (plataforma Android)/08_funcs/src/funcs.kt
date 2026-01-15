fun navaFunc(){
    println("Ola Mundo")

}


fun soma(val1: Int, val2: Int){
    var soma = val1 + (val2 * 3)
    println(soma)
}

fun soma(val1: Int, val2: Int, val3: Int){
    var soma = val1 + (val2 * 3) + val3
    println(soma)
}



fun olaMundo(nome:String): String{
    return "Ola Mundo $nome"
}


fun olaMundo2(ano: Int, nome:String = "Anónimo" ): String{
    return "Ola Mundo $nome em $ano"
}


fun olaMundo3(nome:String = "Anónimo", ano: Int,  ): String{
    return "Ola Mundo $nome em $ano"
}


fun Int.ePar(): Boolean{
    println("o valor é $this")

    return this % 2 == 0
}



fun Int.cmTOm(): Double{
    return this / 100.0
}