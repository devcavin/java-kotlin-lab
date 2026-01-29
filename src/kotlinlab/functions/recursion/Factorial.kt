package kotlinlab.functions.recursion

/**
 *  function factorial(integer n)
 *     if (n == 1) then
 *        return 1
 *     else
 *        return n * factorial(n-1)
 */

fun factorial(n: Int): Int {
    var f = 1
    for (i in 1..n)
        f *= i
    return f
}