package kotlinlab.basic.types

fun main() {
    val example = "Example"
    println(example.substring(3))     // 1
    println(example.substring(0, 7))  // 2
    // println(example.substring(-1, 0)) // 3
    println(example.substring(0, 0))  // 4
    // println(example.substring(0, 8))  // 5
}