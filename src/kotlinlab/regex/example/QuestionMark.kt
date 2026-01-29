package kotlinlab.regex.example

/**
 * The question mark ? is a special character that denotes optionality. It means “the preceding character or nothing”
 */

fun main() {
    val regex = Regex("cats?") // creating the "cats?" regex

    val stringCat = "cat"
    val stringManyCats = "cats"

    println(regex.matches(stringCat))   // true
    println(regex.matches(stringManyCats))   // true
    println(regex.matches("cats are cute")) // false
}