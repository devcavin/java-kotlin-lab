package kotlinlab.functions.callstack

// last
fun mult(a: Int, b: Int): Int {
    return a * b
}

// second
fun printMult(a: Int, b: Int) {
    println(mult(a, b))
}

// first
fun main() {
    printMult(3, 4)
}