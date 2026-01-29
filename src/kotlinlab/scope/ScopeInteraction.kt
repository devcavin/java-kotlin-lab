package kotlinlab.scope

fun main() {
    var id = 5
    if (true) {
        id = 6
        var id = 10 // val is more appropriate since this is a local variable to the block
        println(id)  // prints 10
    }
    println(id)  // prints 6
}