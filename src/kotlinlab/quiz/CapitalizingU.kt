package kotlinlab.quiz

fun main() {
    val string = readln()

    val lastUIndex = string.lowercase().lastIndexOf('u')

    if (lastUIndex != -1) {
        val prefix = string.substring(0, lastUIndex + 1)

        val suffix = string.substring(lastUIndex + 1)

        val result = prefix + suffix.uppercase()

        println(result)
    } else {
        println(string)
    }
}