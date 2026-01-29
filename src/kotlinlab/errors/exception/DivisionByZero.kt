package kotlinlab.errors.exception

fun main() {
    val average = average(2, 0)
    println(average) // this will throw a zero division error
}

// a function that will throw Division By Zero error
val average = { totalItems: Int, numberOfItems: Int ->
    try {
        totalItems / numberOfItems
    } catch (e: ArithmeticException) {
        println(e.message)
    }
}