import kotlin.random.Random


fun main() {
    val name = "Kotlin"


    println(0..10)
    println(40..10)


    for (i in 1..10) {
        println(i)
    }


    for (i in 'a'..'z') {
        println(i)
    }

    val startTime = System.nanoTime()
    var contador = 0
    while (contador < 10_00_000){
        // print("$contador ")
        contador++

    }

    val endTime = System.nanoTime()

    var time = endTime - startTime


    val elapsedTimeMillis = time / 1_000_000
    println("\ntempo: $elapsedTimeMillis ms")


    println("---------------------------")

 for (i in 1..10) {

     if (i % 2 == 0) {
         continue
     }
     println(i)
 }


    var cont = 0

    while (true){
        contador++



        var rand = Random.nextInt(0, 1000)
        if (rand % 2 == 0) {
            continue
        }

    }

}



// O(log n)
// O(n)
// O(1)
// O(n2) 2 -> 4 -> 3 -> 9 - 4-> 16


/*



    [ ] { } ( ) - ok


    {()[]} - ok
    {([)]} - nao ok
    {}{{{[]}}}()[] - ok




 */