package kotlinlab.functions.recursion

/**
 * 1. Direct recursion
 *
 * It’s the case when a function simply calls itself only once. Our recursive factorial makes a good example:
 */

fun factorialRecursive(n: Int): Int = if (n == 0 || n == 1) 1 else n * factorialRecursive(n - 1)

/**
 * 2. Indirect recursion
 *
 * This is the case when a function uses some other function, which, in turn, calls the former function. There’s no necessity to do it like that, but a modified version of the factorial function can be an example:
 */

fun weirdFactorialRecursive(n: Int): Int = if (n == 0 || n == 1) 1 else factorialCompute(n)

fun factorialCompute(n: Int): Int = n * weirdFactorialRecursive(n - 1)


/**
 * 3. Tail recursion
 *
 * A function utilizes tail recursion if a recursive call is the last thing the function does.
 *
 * See, for example, a factorial function with the final call being recursive. This version is a bit different, since usually, we do multiplication last, while here we do it before passing the result to the recursive call.
 */

fun tailFactorialRecursive(n: Int, cur: Int = 1): Int {
    if (n == 0) return cur
    return tailFactorialRecursive(n - 1, cur * n)
}

/**
 * 4. Multiple recursion
 *
 * This is the case when a function makes several calls to itself. As an example, there is a well-known sequence of numbers called the Fibonacci numbers. In this sequence, each next number is the sum of the two preceding ones, starting at F0=0F0​=0, F1=1F1​=1. Then, each new Fibonacci number is calculated as follows: Fn=Fn−1+Fn−2Fn​=Fn−1​+Fn−2​.
 *
 * A program for calculating this sequence utilizes multiple recursion: in order to compute the current Fibonacci number, we need to compute the two preceding ones, therefore making 2 recursive calls
 */

fun fibonacci(n: Int): Int {
    if (n <= 0) return 0
    if (n == 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}