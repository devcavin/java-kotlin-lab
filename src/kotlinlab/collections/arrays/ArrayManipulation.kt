package kotlinlab.collections.arrays

fun main() {
    /**
     * Accessing elements
     *
     * You can change the values of array elements. Use the index to set a value in the array
     */

    val numbers = IntArray(3) // numbers: 0, 0, 0

    numbers[0] = 1 // numbers: 1, 0, 0
    numbers[1] = 2 // numbers: 1, 2, 0
    numbers[2] = numbers[0] + numbers[1] // numbers: 1, 2, 3

    println(numbers[0]) // 1, the first element
    println(numbers[2]) // 3, the last element

    // trying to access non-existent index
    // val elem = numbers[3] // this will return ArrayIndexOutOfBoundsException exception
    // println(elem)

    // last index or element
    val alphabet = charArrayOf('a', 'b', 'c', 'd')

    val last = alphabet[alphabet.size - 1]    // 'd'
    val preLast = alphabet[alphabet.size - 2] // 'c'

    println(last)
    println(preLast)

    /**
     * In addition, Kotlin provides several convenient ways to access the first and the last elements of an array as well as to access the last index
     */

    println(alphabet.first())   // 'a'
    println(alphabet.last())    // 'd'
    println(alphabet.lastIndex) // 3
}