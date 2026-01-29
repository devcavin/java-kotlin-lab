package kotlinlab.regex.string

/**
 * The %s specifier can be modified in order to define the space an argument can occupy and its alignment. If N is a positive integer, then %Ns denotes that the argument should occupy the space of N characters (width indicator). In case N is smaller than the string length, the string will occupy the space equal to its length (it is not truncated). By default, a string is right-aligned within its available space
 */

fun main() {
    val string = "String"

    for (i in 1..15) println(String.format("%${i}s", string.lowercase())) // %d for integers
}