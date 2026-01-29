package kotlinlab.controlflow

fun main() {
    println("Before the loop")
    for (i in 1..10) {
        if (i == 3) {
            break
        }
        println(i)
    }
    println("After the loop")
}