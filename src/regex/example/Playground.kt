package regex.example

fun main() {
    val color = Regex("colou?rs?")
    println(color.matches("color"))
    println(color.matches("colour"))
    println(color.matches("colors"))
    println(color.matches("colours"))

    val answer = "I can do my homework on time!"
    val anotherAnswer = "I can't do my homework on time!"
    val regex = Regex("I can('t)? do my homework on time!") // val regex = Regex("I can(\\'t)? do my homework on time!")
    println(regex.matches(answer))
    println(regex.matches(anotherAnswer))
}