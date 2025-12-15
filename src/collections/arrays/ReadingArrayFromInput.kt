package collections.arrays

fun main() {
    val size = readln().toInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = readln().toInt()
    }

    for (i in array.lastIndex downTo 0) {
        print("${array[i]} ")
    }
}