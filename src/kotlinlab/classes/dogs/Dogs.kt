package kotlinlab.classes.dogs

import kotlin.math.abs
import kotlin.math.round

class Dogs(val name: String, weightParam: Int, breedParam: String) {
    init {
        println("Dog $name has been created")
    } // initializing the class

    var activities: Array<String> = arrayOf("Walks")

    val breed: String = breedParam.uppercase()

    init {
        println("The breed is $breed")
    }

    // setting the weight value for a given condition met
    var weight: Int = weightParam
    set(value) {
        field = if (value > 0) value else abs(value) // this will set the weight to be absolute value if negative weight is detected
    }

    // getting the value of weight in KGs
    val weightInKgs: Double
        get() = round( weight / 2.2)

    // the bark function
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main() {
    val myDog = Dogs("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")

    myDog.weight = -2 // the negative sign will be dropped
    println("Weight is ${myDog.weight}")

    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    myDog.activities.forEach { println("My dog enjoys $it") }

    val dogs = arrayOf(Dogs("Kelpie", 20, "Westie"), Dogs("Ripper", 10, "Poodle"))
    dogs[0].bark()
    dogs[0].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}