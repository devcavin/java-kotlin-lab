package kotlinlab.collections.arrays

/**
 * A for loop allows you to iterate through an entire array. Let's take a look at several ways how you can use it
 */

fun main() {
    val daysOfWeek = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (day in daysOfWeek) println(day)

    println("_____________________________________________________________________________________")

    /**
     * It is possible to access elements by their indexes directly from the loop. To do that, you must get the array.indices property that represents a range of valid array indexes
     */

    for (index in daysOfWeek.indices) println("$index: ${daysOfWeek[index]}")

    println("_____________________________________________________________________________________")

    /**
     * Accessing the subarray or section of array
     */

    for (index in 1..5) {
        println("$index: ${daysOfWeek[index]}")
    }

    /**
     * Also, you can use open-ended range index in 1..<5, look at this code
     */

    println("_____________________________________________________________________________________")

    for (index in 1..<5) {
        println("$index: ${daysOfWeek[index]}")
    }

    println("_____________________________________________________________________________________")

    /**
     * To use the last index of an array in ranges, you need to access array.lastIndex. So, we can modify the code this way
     */

    for (index in 1 until daysOfWeek.lastIndex) {
        println("$index: ${daysOfWeek[index]}")
    }

    println("_____________________________________________________________________________________")

    /**
     * If you want to iterate through an array in reverse order, use downTo in a range. You can also specify the offset between indexes using step
     */

    for (index in daysOfWeek.lastIndex downTo 0 step 2) {
        println("$index: ${daysOfWeek[index]}")
    }

    println("_____________________________________________________________________________________")
}