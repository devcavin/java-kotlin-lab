package kotlinlab.basic.types

fun main() {
    val hello = "Hello world"
    println(hello.replace("Hello ", ""))
    println(hello.substring(5, 11))
    println(hello.substringAfter('w'))
    println(hello.substring(6))
}