package collections.arrays

/**
 * To read an array of a certain size from the console, we first need to create an array of some type with a known size. Inside the parentheses, we should place readln(), with the help of which we can read input from the console. The readln() function returns a string, so don’t forget to convert the input string into the type of the created array
 */

fun main() {
    val numbers = IntArray(5) { readln().toInt() } // on each line single numbers from 1 to 5
    println(numbers.joinToString()) // 1, 2, 3, 4, 5

    // here we have an input string "1 2 3 4 5"
    val numbersOne = readln().split(" ").map { it.toInt() }.toTypedArray()
    println(numbersOne.joinToString()) // 1, 2, 3, 4, 5

    // more using regex
    val regex = "\\s+".toRegex()
    val str = "1 2\t\t3  4\t5  6"
    val nums = str.split(regex).map { it.toInt() }.toTypedArray()
    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6
}