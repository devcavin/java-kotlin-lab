package kotlinlab.classes.examples

class Dog(
    // properties of the Dog class
    val name: String,
    var weight: Int,
    val breed: String
) {
    // functions of the Dog class
    fun bark(): String {
        return if (weight <= 20) "Yip!" else "Woof!"
    }
}

/**
 * A function defined inside a class is called a member function( sometimes also known as a method)
 */

fun main() {
    // creating an object from a class
    val myDog = Dog(
        name = "Fido",
        weight = 70,
        breed = "Mixed"
    )

    // accessing properties and functions of an object of a class
    // functions and properties can be accessed using the (.) example below
    println(myDog.breed) // fetching our dog's breed
    println(myDog.bark()) // calling the bark() function of the dog object

    // we can update any property of the object by
    myDog.weight = 75
}