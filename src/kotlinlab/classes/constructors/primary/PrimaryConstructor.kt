package kotlinlab.classes.constructors.primary

/**
 * In Kotlin, a primary constructor is a special type of constructor that is declared as part of the class header, after the class name.
 *  It does not contain any code, it just initializes an instance of a class and its properties.
 *  To define a primary constructor, you should put class initialization arguments in the parentheses after the class name.
 */

class ShapeOne(height: Int, width: Int) {
    val width = width
    val height = height

    fun area(): Int = width * height
}

class Size constructor(width: Int, height: Int) {
    val width: Int = width
    val height: Int = height
    val area: Int = width * height
}

fun main() {
    val shape = ShapeOne(2, 2)
    println("The area of the shape is ${shape.area()}")
}