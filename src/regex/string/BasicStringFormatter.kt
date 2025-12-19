package regex.string

/**
 * Kotlin String templates are a powerful tool for formatting strings. However, they have limitations, especially when one wants to print numerical values. Here, the String format() member function comes into play, which provides much more flexibility.
 *
 * In Kotlin, the String.format() method returns a string formatted using a format string and a number of arguments. The format string defines how the arguments form the resulting string. As an example, let's create a string and print it
 */
fun main() {
    val string = String.format("%s, %s", "Hello", "World") // basic string formatting
    // alternatively we could do
    // val string = "%s %s".format("Hello", "World")

    /**
     * In order to print all string characters in the upper case, we can use the format specifier %S, like in the following example
     */
    // val string = "%S, %S".format("Hello", "World")
    println(string)

    // NOTE: In case the syntax of a format string is incorrect, an IllegalFormatException is thrown

    // String indexing while formatting
    val str1 = "Kotlin"
    val str2 = "the best language"
    // %s is used to represent the String value,
    // %1 is used to represent first argument
    // %2 is used to represent second argument
    var str = String.format($$"%1$s is %2$s", str1, str2) // with interpolation prefix for simplifying the string
    println(str) // // Kotlin is the best language

    // you can change the order of arguments
    str = String.format($$"%2$s is %1$s", str1, str2) // str = String.format("%2\$s is %1\$s", str1, str2)
    println(str) // the best language is Kotlin
}