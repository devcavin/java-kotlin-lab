package kotlinlab.basic.variables

fun main(){
    /**
     * Float and double are used to declare fractional numbers or types of variables
     * Double is the default inference for decimal values
     * Double is larger than float
     *
     * syntax
     * val myFloat: Float = 2.45
     * val myDouble: Double = 2.9595425
     *
     *
     */

    println("Max float is ${Float.MAX_VALUE} while min float is ${Float.MIN_VALUE}")
    println("Max double is ${Double.MAX_VALUE} while min double is ${Double.MIN_VALUE}")

    val myNumber = 100_000_000_000_000.00
    println(myNumber)

    val mySecondNumber = 100_000_000_000_000.0F //we can use suffix `f or F` to denote floating type values in variable initialization
    println(mySecondNumber)

    val myThirdNumber = 1000.0f
    println(myThirdNumber)
}