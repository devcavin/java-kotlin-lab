package kotlinlab.classes.constructors.primary

/**
 * You can put simple property declarations inside the primary constructor. To declare a read-only property, put the keyword val in the parentheses before the argument name. For a mutable property, use the keyword var.
 */

class Shape(val width: Int, val height: Int) {

    // member function
    fun area(): Int {
        return width * height
    }
}

fun main() {
    val shape = Shape(2, 2)
    println(shape.area())
}