package kotlinlab.tests

fun sum(): Int {
    val a = 4
    val b = 6
    return a + b
}

fun main() {
    val expectedSum = 10

    if (expectedSum == sum()) {
        println("Test passed")
    } else {
        println("Test failed")
    }
}