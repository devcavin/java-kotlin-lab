package kotlinlab.generics

/*
Generics allows us to write type safe code for objects, collections, classes, interfaces and many more by disallowing unmatched types
For example generics would help you prevent someone from sticking fish into ducks and vise versa

Things you can do with generic interfaces or classes
- create an instance of a generified class: When you create a collection such as a MutableList, you have to tell it
the type of objects you’ll allow it to hold, or let the compiler infer it

- create a function that takes a generic type: You can create a function with a generic parameter by specifying its
type, just as you would any other sort of parameter

- create a function that returns a generic type: A function can return a generic type too
 */

fun main() {
    // creating an instance of a generified class
    val duckList: MutableList<String> = mutableListOf("duck1", "duck2", "duck3")
}

// creating a function that takes a generic type and also returns a generic type
fun genericTypeFun(myDucks: List<String>): MutableList<String> {
    TODO("Do something else")
}