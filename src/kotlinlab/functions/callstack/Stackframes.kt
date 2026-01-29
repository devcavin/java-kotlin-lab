package kotlinlab.functions.callstack

fun repeat(s: String): String {
    return s + s
}

fun printLine(str: String) {
    println(str)
}

fun main() {
    printLine(repeat("Hello!"))
}