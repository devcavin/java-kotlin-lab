package kotlinlab.classes.examples

class Device(val type: String, power: Int)  {
    init {
        println("Device $type initialized with power ${power}W")
    }
}