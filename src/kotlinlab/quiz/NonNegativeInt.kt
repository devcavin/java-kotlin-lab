package kotlinlab.quiz

/**
 * The aim of the problem is to identify the number of tens available in the number N which is assumed to be 0 or less than 1000000
 */

fun main() {
    val n = readln().toInt()
    val stringOfN =  n.toString()
    val numberAtTens = if (stringOfN.length == 1) 0 else stringOfN[stringOfN.length - 2].toString().toInt()
    println(numberAtTens)
}