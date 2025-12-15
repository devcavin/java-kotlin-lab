package problem_of_the_day

fun isPrime(n: Int, i: Int = 2): Boolean {

    if (n < 2) {
        return false
    }

    if (i * i > n) {
        return true
    }

    if (n % i == 0) {
        return false
    }

    return isPrime(n, i + 1)
}

fun main() {
    val input = readln()

    val n = input.toIntOrNull()

    if (n != null) {
        println(isPrime(n))
    }
}

/**
 * fun isPrime(n: Int, i: Int = 2): Boolean {
 *     // base cases
 *     if (n <= 1) return false          // 0 and 1 are not prime
 *     if (i * i > n) return true        // no divisors found
 *     if (n % i == 0) return false      // divisor found
 *
 *     // recursive case
 *     return isPrime(n, i + 1)
 * }
 *
 * fun main() {
 *     val n = readLine()!!.toInt()
 *     print(isPrime(n))
 * }
 *
 */