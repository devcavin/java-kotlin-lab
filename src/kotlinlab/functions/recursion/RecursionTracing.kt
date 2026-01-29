package kotlinlab.functions.recursion

fun m(x: Int, y: Int): Int {
    return if (x < y) {
        x
    } else {
        m(x - y, y)
    }
}


fun main() {
    println(m(50, 7))
}