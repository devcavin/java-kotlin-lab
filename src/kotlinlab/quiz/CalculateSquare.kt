package kotlinlab.quiz

fun calculateSquare(array: IntArray?, index: Int) {
    try {
        println(array!![index] * array[index])
    } catch (e: Exception) {
        println("Exception!")
    }
}

fun main() {
    calculateSquare(intArrayOf(1, 2, 3, 4), 9)
}