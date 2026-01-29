package kotlinlab.scope

val top = "Top-level variable" // this is like a global variable

fun localScope() {
    println(top)
}

fun main() {
    println(top)  // prints "Top-level variable"
    localScope()  // prints "Top-level variable"
}