package kotlinlab.basic
// Even odd number checker

fun evenOddPicker(input: Int): Boolean = input % 2 == 0

fun main() {
    val userInput = readln().toInt() // reading the input

    // I might want to catch some exceptions from the user input while checking against the function
    @Suppress("UNUSED_VARIABLE")
    val result = try {
        evenOddPicker(userInput)
    } catch (e: NumberFormatException) {
        false
    }

    if (result) println("$userInput is even") else println("$userInput is odd")
}