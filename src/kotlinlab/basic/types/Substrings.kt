package kotlinlab.basic.types

fun main() {
    /**
     * Oftentimes, you need to get only a certain part of a string. Kotlin provides the substring function for this.
     *
     * The substring function accepts startIndex (inclusive) and lastIndex (exclusive) as arguments and returns a string that starts at the startIndex and ends right before the lastIndex.
     */

    val greeting = "Hello"
    println(greeting.take(3)) // "Hel"
    println(greeting.substring(1, 3)) // "el"
    println(greeting.substring(2))    // "llo"
    println(greeting[4]) // "o"

    println(greeting.substringAfter('o'))  // "lo"
    println(greeting.substringBefore('o')) // "Hell"
    println(greeting.substringBefore('z')) // "Hello"

    println(greeting.last()) // last character of the string

    val example = "Good morning..."
    println(example.replace("morning", "bye")) // "Good bye..."
    println(example.replace('.', '!'))         // "Good morning!!!"
    println(("There is no royal road to learning").length)
}