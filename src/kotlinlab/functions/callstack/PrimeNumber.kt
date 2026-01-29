package kotlinlab.functions.callstack

import kotlin.math.sqrt

fun printIfPrime(number: Int) {
    // 1 is NOT a prime number
    if (number <= 1) {
        println("$number is not a prime number.")
        return
    }

    // Check divisibility from 2 to sqrt(number)
    for (i in 2..sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            println("$number is not a prime number.")
            return
        }
    }

    // If no divisor was found
    println("$number is a prime number.")
}

fun main() {
    // write here
    val input = readln().toInt()
    printIfPrime(input)
}