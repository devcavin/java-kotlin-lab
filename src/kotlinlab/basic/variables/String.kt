package kotlinlab.basic.variables

/**
 * Strings literals are used to store long text in Kotlin just like other programming languages
 * to declare string variable we use the String type but Kotlin being a strongly typed language will inference this for us automatically if it detects long texts or statements
 * syntax
 * val myString: String = "I love Kotlin!"
 *
 * Note: Unlike other programming languages Kotlin only accepts double quotes("") for string literals and single quotes('') for character literals so we can't declare as below
 * val myStringTest = 'I love Kotlin!' // This will cause chaos
 */

fun main(){
    val myString = "I love Kotlin!"
    println(myString)
}