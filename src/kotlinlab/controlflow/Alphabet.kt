package kotlinlab.controlflow

fun main() {
    // MUST use "return" keyword
    val input = readln().first()
    // val alphabets = ('a'..'z') // ('A'..'Z')
    for (i in ('a'..'z')) {
        if (i == input) return
        print(i)
    }

    println(('a'..'z').joinToString("").substringBefore(input))
}