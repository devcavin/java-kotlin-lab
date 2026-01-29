package kotlinlab.regex.example

/**
 * If part of the actual regex happens to be a special character, this can be managed with the escape character. When you create strings with special characters, you can escape them using a double backslash \\
 */

fun main() {
    val regex = Regex("cats\\?")

    val stringCat = "cat"
    val stringManyCats = "cats"
    val stringEmotionalCats = "cats?"

    println(regex.matches(stringCat))   // false
    println(regex.matches(stringManyCats))   // false
    println(regex.matches(stringEmotionalCats))  // true
}