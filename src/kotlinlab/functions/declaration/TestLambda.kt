package kotlinlab.functions.declaration

fun first(value: Int, func: (Int) -> Int): Int = func(value)
fun second(func: (Int) -> Int, value: Int): Int = func(value)

fun main() {
    println(first(5) { i -> i })
    println(first(5) { it })
    println(first(5) { it })
    println(second({ i -> i }, 5))
    println(second({ it }, 5))
    // println(second(5) { it })
}