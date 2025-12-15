package collections.arrays

/**
 * To compare two arrays, invoke the contentEquals() function of an array and pass another array as the argument. This function returns true when two arrays contain the same elements in the same order. Otherwise, it returns false
 */

fun main() {
    val numbers1 = intArrayOf(1, 2, 3, 4)
    val numbers2 = intArrayOf(1, 2, 3, 4)
    val numbers3 = intArrayOf(1, 2, 3)

    println(numbers1.contentEquals(numbers2)) // true
    println(numbers1.contentEquals(numbers3)) // false

    /**
     * Beware, the operators == and != do not compare the contents of arrays, they compare only the variables that point to the same object
     */

    val simpleArray = intArrayOf(1, 2, 3, 4)
    val similarArray = intArrayOf(1, 2, 3, 4)

    println(simpleArray == simpleArray)  // true, simpleArray points to the same object
    println(simpleArray === similarArray) // false, similarArray points to another object
}