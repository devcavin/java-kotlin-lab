package kotlinlab.tests

fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val x = 2
    val y = 8
    val output = add(x, y)
    if (10 == output) println("Passed") else println("Failed")
}