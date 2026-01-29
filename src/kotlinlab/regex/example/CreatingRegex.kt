package kotlinlab.regex.example

fun main() {
    val string = "cat"
    val regex = Regex(string) // creation via constructor call: Regex(pattern: String)
    val anotherRegex = string.toRegex() // creation via extension function:

    println(regex)
    println(anotherRegex)
}