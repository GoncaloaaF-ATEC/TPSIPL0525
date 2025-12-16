import java.awt.AWTException
import java.util.Locale
import java.util.Locale.getDefault

/*
    arrays

 */


fun main() {
    val lst = arrayOf("Nome1", "Nome2", "Nome3")
    println(lst[0])
    println(lst[2])
    println(lst[1])

    lst[1] = "Novo Valor"

    println(lst[1])


    println("Nome1" in lst)

    println(lst.size)

    println("----------")
    for (elm in lst){
        println(elm)
    }


    println("----------")
    // idx: val
    for (elm in 0..lst.size-1){
        println("$elm: ${lst[elm]}")
    }


    println("----------")
    // idx: val
    for ((idx, elm) in lst.withIndex()){
        println("$idx: $elm")
    }





    println("----------")

    val notas = arrayOfNulls<Int>(5)

    try {
        // println(1/0)
        println(notas[6])

    }catch (e: ArithmeticException){
        println("Erro1: ${e.message}")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("Erro2: ${e.message}")
    }

    println("----------")


    val idade = intArrayOf(1, 2, 3)



    println("----------")


    val lst3 = mutableListOf(1,2,3)

    val lst5 = mutableListOf<Int>()


    lst3.add(4)
    lst3.add(2, 99)

    lst3.addFirst(41)
    lst3.addLast(88)

    println(lst3)
    lst3.remove(3)
    println(lst3)

    lst3.addLast(41)

    lst3.addLast(41)

    println("-----ok-----")
    println(lst3.remove(41))
    println(lst3)

    println("-----nok-----")
    println(lst3.remove(1234))

    println("----------")

    println(lst3.removeAt(2))

    println("----------")

    println(lst3.removeAt(999))






}