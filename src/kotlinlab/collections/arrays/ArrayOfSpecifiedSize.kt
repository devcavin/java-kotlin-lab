package kotlinlab.collections.arrays

/**
 * To create an array of a certain size, we need to write its type and pass it after the type name in round brackets (the constructor)
 *
 * Another option is to use the Array constructor that takes the array size and the function that returns values of array elements given its index or a constant value or using a combination of the apply scope function and the fill() method that fills an array with the specified element
 */

fun main() {
    val numbers = IntArray(5) // an array of 5 integer numbers
    println(numbers.joinToString())

    val doubles = DoubleArray(7) // an array of 7 doubles
    println(doubles.joinToString())

    val numbers1 = IntArray(10) { i -> i + 1 }
    println("Numbers: ${numbers1.joinToString()}")
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

    val onlyOne = IntArray(10) { 1 }
    println("Only 1: ${onlyOne.joinToString()}")
    // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1

    val onlyMinusOne = IntArray(10).apply { fill(-1) }
    println("Only -1: ${onlyMinusOne.joinToString()}")
    // -1, -1, -1, -1, -1, -1, -1, -1, -1, -1
}