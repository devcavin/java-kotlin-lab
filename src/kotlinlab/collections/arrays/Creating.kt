package kotlinlab.collections.arrays

fun main() {
    // creating an array
    val numbers = intArrayOf(1, 2, 3, 4, 5) // It stores 5 elements of the Int type
    println(numbers.joinToString()) // 1, 2, 3, 4, 5

    val characters = charArrayOf('K', 't', 'l') // It stores 3 elements of the Char type
    println(characters.joinToString()) // K, t, l

    val doubles = doubleArrayOf(1.25, 0.17, 0.4) // It stores 3 elements of the Double type
    println(doubles.joinToString()) // 1.25, 0.17, 0.4
}