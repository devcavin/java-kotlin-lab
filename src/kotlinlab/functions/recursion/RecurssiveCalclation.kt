package kotlinlab.functions.recursion

/*
fun f(n: Int): Int {
    return if (n > 2) {
        f(n - 1) + f(n - 2) + f(n - 3)
    } else {
        n
    }
}

fun main() {
    println(f(6))
}*/


/*
fun f(n: Int) {
    if (n > 0) g(n - 1)
}

fun g(n: Int) {
    print("*")
    if (n > 1) f(n - 3)
}*/


fun digitSum(n: Int): Int {
    // base case: single digit
    if (n < 10) return n

    // recursive case
    return n % 10 + digitSum(n / 10)
}

fun main() {
    val n = readln().toInt()
    print(digitSum(n))
}