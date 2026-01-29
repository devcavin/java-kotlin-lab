package kotlinlab.quiz

open class Vehicle(open val type: String)

data class Car(override val type: String, val brand: String) : Vehicle(type)

fun main() {
    val car1 = Car("Sedan", "Toyota")
    val car2 = car1.copy(type = "Coupe")

    println(car1 == car2)
}