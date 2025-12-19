package regex.string

/**
 * Besides format specifiers, a format string can contain any text. Also, apart from the specifiers for various
 * argument types, there are some special specifiers. Thus, %% inserts the % sign, while %n inserts a newline and so on
 */

fun main() {
    val myString = String.format("The percentage of%nthis amount is 30%%.\nIt is easy to remember.")
    println(myString)
}