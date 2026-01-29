package kotlinlab.functions.equality

/**
 * Structural equality of variables implies equality of inner states.
 *
 * You can use the operators == and != to check structural equality.
 */

// Example

fun main() {
    val a = 5
    val b = 5

    // check for the differences now
    println("This is structural equality check of $a and $b: ${a == b}")
    println("This is referential equality check of $a and $b: ${a === b}")
}