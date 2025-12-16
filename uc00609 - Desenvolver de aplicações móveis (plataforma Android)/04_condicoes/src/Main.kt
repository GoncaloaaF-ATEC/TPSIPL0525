
fun main() {
    val idade = 18

    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (idade == 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }


    var mes = 12

    var res = when (mes) {
                1 -> "Jan"
                2 -> "Feb"
                3 -> "Mar"
                4 -> "Apr"
                5 -> "May"
                6 -> "Jun"
                7 -> "Jul"
                8 -> "Aug"
                9 -> "Sep"
                10 -> "Oct"
                11 -> "Nov"
                12 -> "Dec"
                else -> "Unknown"
            }


    println(res)

    var num: Long = 9223372036854775807
                  //9223372036854775807

    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)
    println(Int.MAX_VALUE)
    println(Double.MAX_VALUE)


    var numd: Double = 9223372036854775807922337203685477922337203685477580792233720368547758079223372036854775807922337203685477580792233720368547758075807922337203685477580792233720368547758079223372036854775807.0
    println(numd)


    

}