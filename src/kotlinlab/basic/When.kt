package kotlinlab.basic

fun main(){
    print("Enter your traffic light color [Red, Yellow, Green]: ")
   val trafficLightState = readln().lowercase() // This can be "Green", "Yellow", or "Red"
    val trafficAction = when (trafficLightState) {
        "green" -> "Go"
        "yellow" -> "Slow down"
        "red" -> "Stop"
        else -> "Invalid traffic light, report the incident!"
    }
    println(trafficAction)

}