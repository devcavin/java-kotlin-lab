package collections.arrays

fun main() {
    val numbers = readln().split(' ').map { it.toInt() }.toIntArray()
    // Do not touch lines above
    // Write only exchange actions here.

    //testing
    // val numbers = arrayOf(12, 17, 8, 101, 33)
    val first = numbers.first()
    val last = numbers.last()

    numbers[0] = last
    numbers[numbers.size - 1] = first
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}