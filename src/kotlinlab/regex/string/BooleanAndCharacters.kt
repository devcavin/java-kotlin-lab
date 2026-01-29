package kotlinlab.regex.string

/**
 * Format specifiers for the boolean type are %b (for lower case) and %B (for upper case)
 *
 * Format specifiers for the character type are %c (for lower case) and %C (for upper case)
 *
 * All the above-discussed specifiers are summarized in the following table:
 *
 * Format specifier
 *
 *
 * Argument type
 *
 *
 * Output string
 *
 * %s
 *
 *
 * Any type that implements the toString() method
 *
 *
 * String
 *
 * %d
 *
 *
 * Int, Byte, Short, Long, BigInteger
 *
 *
 * Decimal integer
 *
 * %o, %#o
 *
 *
 * Int, Byte, Short, Long, BigInteger
 *
 *
 * Octal number
 *
 * %x, %X
 *
 *
 * Int, Byte, Short, Long, BigInteger
 *
 *
 * Hexadecimal number
 *
 * %f
 *
 *
 * Double, Float
 *
 *
 * Decimal floating point number
 *
 * %e, %E
 *
 *
 * Double, Float
 *
 *
 * Floating point number in scientific notation
 *
 * %g, %G
 *
 *
 * Double, Float
 *
 *
 * Floating point number in decimal or scientific notation
 *
 * %b, %B
 *
 *
 * Boolean
 *
 *
 * Boolean value
 *
 * %c, %C
 *
 *
 * Char
 *
 *
 * Character
 *
 * %n
 *
 *
 * Char
 *
 *
 * Newline
 *
 * %%
 *
 *
 * Char
 *
 *
 * The % character
 */

fun main() {
    val boolean = true
    println(String.format("%b",boolean))    //true
    println(String.format("%B",boolean))    //TRUE

    val char = 'a'
    println(String.format("%c", char))     //a
    println(String.format("%C", char))     //A

    println(String.format("|%(07d - %.6f - %4B|", -107, 12.34, true))
}