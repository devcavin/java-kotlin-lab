package kotlinlab.collections.lists

/**
 * List is a container that keeps the elements of a given type in the same order in which they were added. Also, List allows duplicate elements. So, if you want to store items in the order of their insertion, and it doesn't matter to you that they can be repeated, use List. For example, you could store student rating history in a List.
 *
 * List is an immutable collection. Its size cannot be changed after it is initialized. This type allows duplicates and stores elements in a specific order
 *
 * List is a generic type. Therefore, you can initialize it with the help of listOf<E>, where E is the type of elements contained in the list
 * val textUsMethod = listOf<String>("SMS", "Email")
 */

fun main() {
    // list of cars I have drove this year
    val listOfCars = listOf("BMW", ",Mercedes Benz", "Toyota", "Volkswagen", "Honda", "Kia", "Audi", "Chevrolet/TrailBlazer")
    println(listOfCars) // output
}

