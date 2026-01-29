package kotlinlab.classes.inheritance.appliance

abstract class Appliance(val color: String) {
    var pluggedIn = true
        private set

    abstract fun consumePower()
}

// subclasses of Appliance
class CoffeeMaker(
    color: String
) : Appliance(color) {

    var coffeeLeft = false

    override fun consumePower() {
        println("Consuming power")
    }

    fun fillWithWater() {
        println("Fill with water")
    }

    fun makeCoffee() {
        println("Make the coffee")
    }
}