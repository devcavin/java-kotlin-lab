package kotlinlab.classes.constructors

/**
 * Constructors are class members that initialize a new object of the class. In other words, constructors set a new object state by defining its properties.
 *
 */

class Size {
    val height = 1
    val width = 1
}

fun main() {
    // creating objects
    val size = Size() // when we call the class like this with no arguments, by default  constructor is created
    // the default constructor created is a primary constructor
}