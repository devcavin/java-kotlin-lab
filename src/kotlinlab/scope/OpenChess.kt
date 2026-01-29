package kotlinlab.scope

var madEye = "Barty Crouch"
// change only the code of the openChest() function
fun openChest() {
    madEye = "Alastor Moody"
}


fun main() {
    println(openChest())
}