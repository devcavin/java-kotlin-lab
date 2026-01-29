package kotlinlab.functions.callstack

fun printNextEvenNumber(n: Int): Int {
    val nextEvenNumber = if (n % 2 == 0) n + 2 else n + 1
    return nextEvenNumber
}

fun main() {
    val input = readln().toInt()
    println(printNextEvenNumber(input))
}