package kotlinlab.basic.variables

fun main(){
    /*
    In total kotlin consists of the following basic types
    1. Integers - These are basically numbers ie Byte, Long, Short
    2. Unassigned integers - UByte, ULong, UShort
    3. Floating point values - There are a fraction of integers ie decimals
    4. Booleans - This data type is used to represent values that are either true or false
    5. Characters - Used to present single strings, symbol ie 'a', '@'
    6. Strings - Used to denote a collection of strings or symbols like paragraphs, single line statements or words

    Kotlin also allows you to declare variables or a variable without initializing it with a value
    `var isTrue: Boolean
    isTrue = true
    println("$isTrue")
    `
    This is not recommended because Kotlin is strongly typed language so all variables must be initialized
    As well Kotlin allows ou to null variables
     */

    val a = null // how to make variables null in Kotlin
    val b = 2
    println("Mary is ${b + 3} years old")
    println(a)
}