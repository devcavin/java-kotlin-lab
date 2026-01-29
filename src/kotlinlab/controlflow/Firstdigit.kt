package kotlinlab.controlflow

import kotlin.text.iterator

fun main() {
    // read an input
    val input = readln()

    for (i in input) {
        if (i.isDigit()) {
            println(i)
            return
        }
    }
}