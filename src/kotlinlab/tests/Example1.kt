package kotlinlab.tests

import kotlin.math.pow

fun main() {
    val x = 2
    val y = { ((x.toDouble().pow(2)) + (2 * x) + 1) }
    val expected = 9.0

    if (expected == y()) {
        println("Test passed")
    } else {
        println("Test failed")
    }

    // println(y())
}