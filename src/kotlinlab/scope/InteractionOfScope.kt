package kotlinlab.scope

fun main() {
    var id = 5  // id (outer scope) = 5
    if (true) {
        id = 6  // id (outer scope) = 6
        var id = 10  // id (inner scope) = 10
        println(id)  // prints inner id
    }
    println(id)  // prints outer id
}