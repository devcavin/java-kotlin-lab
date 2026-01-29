package kotlinlab.classes.constructors.primary

import kotlin.math.PI

/**
 * Default values in primary constructors are set in the same way as in the class body. You declare the property with a keyword val or var and place the default value after the assignment operator
 */

class Circle(radius: Double = 5.0) {
    val area = PI * radius * radius
}

fun main() {
    val circle = Circle() // this call will use default argument value
    println("The initial area: ${circle.area}")

    val circle1 = Circle(7.0) // modifying the radius to another value
    println("The area of the circle after the change in radius is ${circle1.area}")
}