package kotlinlab.quiz

fun main() {
    val n = readln().toInt()
    val array = Array(n) { readln().toInt() }
    var maxValue = array[0]
    var maxIndex = 0

    for (i in 1 until array.size) {
        if (array[i] > maxValue) {
            maxValue = array[i]
            maxIndex = i
        }
    }
    println(maxIndex)
}