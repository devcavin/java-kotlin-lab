package kotlinlab.classes.dataclass

/*
Data class is a type of class that allows us to create a class(object) whose kotlinlab.main function is to store data
It includes features that are helpful when you’re dealing with data, such as
a new implementation of the equals function that checks whether two data
objects hold the same property values
You define a data class by prefixing a normal class definition with the data keyword
 */

// how to create a data class
data class MyDataClass(val name: String, val age: Int) // it turns a normal class into a data class

// creating objects from a data class is similar to how we do it in normal classes

/*
Data classes automatically override their equals function in order to change the
behavior of the == operator so that it checks for object equality based on the
values of each object’s properties. If, for example, you create two Recipe
objects that hold identical property values, comparing the two objects with the
== operator will evaluate to true, because they hold the same data
 */

/*
When the compiler generates implementations for data class functions, such as
overriding the equals function and creating a copy function, it only includes
the properties defined in the primary constructor. So if you add properties to
a data class by defining them in the class body, they won’t be included in any of
the generated functions.
 */

data class IgnoredDataClass(val name: String, val age: Int) {
    val city: String = "" // this won't be included in the generated functions
}