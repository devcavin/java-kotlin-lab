package regex.example

/**
 * This special character is already familiar to you: the dot . matches any single character including letters, digits, spaces, and so on. The only character it cannot match is the newline character \n. Other control characters such as \b and \t will still match
 */

fun main() {
    val regex = Regex("Cat.", RegexOption.IGNORE_CASE)
    val stringCat = "cat."
    val stringEmotionalCat = "cat!"
    val stringCatWithSpace = "cat "
    val stringCatN = "cat\n"
    val stringCatB = "cat\b"
    val stringCatT = "cat\t"

    println(regex.matches(stringCat))   // true
    println(regex.matches(stringEmotionalCat))   // true
    println(regex.matches(stringCatWithSpace))  // true
    println(regex.matches(stringCatN))  //false
    println(regex.matches(stringCatB))
    println(regex.matches(stringCatT))
}