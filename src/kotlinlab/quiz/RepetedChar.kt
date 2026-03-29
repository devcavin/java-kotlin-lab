package kotlinlab.quiz

fun main() {
    val word = readln()
    var totalCount = 0

    for (char in word) {
        if (word.count { it == char } == 1) {
            totalCount++
        }
    }

    println(totalCount)
}