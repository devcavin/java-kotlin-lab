package kotlinlab.scope

fun increment(count: Int) = count + 1

fun main() {
    var count = 0
    while (count < 5) {
        increment(count)
    }
    println(count) // infinite loop
}