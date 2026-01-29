package kotlinlab.basic

/**
class Person{
    var name = ""
    var age = 0
    var gender = ""
}

*/



class Person(val name: String, val age: Int, val gender: String)

class Vehicle(val name: String, val model: String, val color: String)


fun students() {
    val student = Person (
        name = "John",
        age = 20,
        gender = "male"
    )

    println("The student found on the road is a ${student.gender} named ${student.name} and he is ${student.age} years old")
}

fun cars() {
    val car = Vehicle (
        name = "Tesla",
        model = "S Plaid",
        color = "Maroon"
    )

    println("You wanted to use the ${car.model} ${car.color} ${car.name} car?")
}

fun main(){
    // instance of class
    students()
    cars()

}