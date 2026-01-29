package kotlinlab.classes.constructors.primary

/**
 * In named arguments you specify the argument by its name during the call
 */

class Car(var color: String = "Maroon", val model: String = "Chevrolet-Trailblazer") {
    // defining some member function
    fun testCar(): String {
        return "This car is $color in color and the model is $model"
    }
}

fun main() {
    // creating the object
    val car =  Car() // we created the car object with default argument
    println(car.testCar())

    // creating the object with named arguments now
    val car1 = Car(color = "Blue") // we've left the model as default argument and called the color as named
    println(car1.testCar())

    // calling both as named arguments
    val car2 = Car(color = "Black",  model = "White")
    println(car2.testCar())

    // but Kotlin always infers the arguments from the constructor therefore the mutability and immutability is carried along
    car.color = "Red"
    // car.model = "Honda" // this won't work since it's declared with val which limits mutability
    println(car.testCar()) // the color here is red


}