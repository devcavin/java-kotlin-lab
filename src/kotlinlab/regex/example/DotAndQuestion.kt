package kotlinlab.regex.example

fun main() {
    val regex = Regex("cat.?") // creating the "cat.?" regex

    val stringCat = "cat"
    val stringManyCats = "cats"
    val stringEmotionalCat = "cat!"
    val stringCot = "cot"

    println(regex.matches(stringCat))   // true
    println(regex.matches(stringManyCats))   // true
    println(regex.matches(stringEmotionalCat))  // true
    println(regex.matches(stringCot))   // false
}