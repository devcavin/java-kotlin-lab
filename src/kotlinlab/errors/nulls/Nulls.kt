package kotlinlab.errors.nulls

import kotlinlab.classes.inheritance.animal.Wolf

/*
If you want to remove a reference to an object from a variable, you can do so by
assigning it a value of null
A null value means that the variable doesn’t refer to an object: the variable still
exists, but it doesn’t point to anything
But there’s a Big Catch. By default, types in Kotlin won’t accept null values. If
you want a variable to hold null values, you must explicitly declare that its
type is nullable.

You declare that a type is nullable by adding a question mark (?) to the end of
the type.

So where can you use nullable types?
A nullable type is one that can hold null values in addition to its base type. A
Duck? variable, for example, will accept Duck objects and null.

You can use a nullable type everywhere you can
use a non-nullable type

Every type you define can be turned into a nullable version of that type by
simply adding a ? to the end of it. You can use nullable types in the same places
that you would use plain old non-nullable types:
a) When defining variables and properties.
b) When defining parameters
c) When defining return types

If you want to access a nullable type’s properties and functions, an alternative
approach is to use a safe call. A safe call lets you access functions and properties a single operation without you having to perform a separate null-check.
?. is the safe call operator. It lets you safely access a nullable type’s functions
and properties.
 */


fun main() {
    // making variable w nullable
     var wolf: Wolf? = Wolf() // we are pulling this object from classes.inheritance.animal.Wolf of our project
    println(wolf?.eat()) // this means that eat() is only called when the wolf is not null

    // to remove the wolf reference we could do
     wolf = null // making it null to remove the object reference
    println(wolf)

    // making variable non-nullable during its definition
    var str: String? = "Pizza"
    println(str)

    str = null
    println(str)

    // defining parameters that are non-nullable and return types
    fun printInt(x: Int?): Int? {
        return x
    }

    val result = printInt(5)
    println(result)

    // it is possible to create an array with null
    val myArray: Array<String?> = arrayOf("Hello", null)
    println(myArray.joinToString(prefix = "[", separator = ", ", postfix = "]")) // arrays are storage containers s must be
}