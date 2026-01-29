package kotlinlab.basic

import kotlin.math.PI

fun circleArea(radius: Int) : Double{
    val area = PI * ( radius * radius)
    return area
}

/**
 *  The function above can be simplified as
 *
 *  fun circleArea(radius: Int): Double = PI * radius * radius // more precise, readable and clear also too short
 *
 */

fun main(){
    print("Enter the value of the radius: ")
    val radius = readln().toInt()
    circleArea(radius)

    println("The area of the circle is ${circleArea(radius)} square units")

    val combinedChar = stringInterpolation()
    println("The combined characters are ${combinedChar.lowercase()}")
}

fun stringInterpolation(): String{
    val char0 = 'k'
    val char1 = 'o'
    val char2 = 't'
    val char3 = 'l'
    val char4 = 'i'
    val char5 = 'n'

    val combinedChar = char0+ ""+ char1 + char2 + char3 + char4 + char5


    return combinedChar
}