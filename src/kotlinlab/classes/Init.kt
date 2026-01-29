package kotlinlab.classes

/*
 * If you need to initialize a property to something more complex than a simple
 * expression, or if there’s extra code you want to run when each object is created,
 * you can use one or more initializer blocks
 *
 * Initializer blocks are executed when
 * the object is initialized, immediately after the constructor is called, and they’re
 * prefixed with the init keyword
 *
 * Just like normal variables all properties in a class must be initialized by a value and when you feel like you want to handle that later Kotlin has an inbuilt keyword "lateinit" that will get rid of the rules and allow you to initialize it later. Doing so allows the compiler to compile your code. In general, however, we
 * strongly encourage you to initialize your properties.
 */

class Initializer {
    init {
        println("This is an example of initializer block")
    }
    // fun amIReal(): Boolean = false.also { println("Thanks, Cavin.") }

    // declare a property for later initialization using lateinit
    lateinit var name: String
}

fun main() {
    Initializer()
}