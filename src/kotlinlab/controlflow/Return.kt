package kotlinlab.controlflow

/**
 * Without a label, the return statement lets us return the result to the nearest enclosing function. It can be really helpful if we want to jump out of a loop for some reason and skip the remaining loop code or exit the current function
 */

fun foo() {
    val number = intArrayOf(1, 2, 3, 4, 5)
    for (it in number) {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

fun main() {
    foo() // calling foo()
    println()
    println("foo() is over")
    for (i in 1..10) {
        for (j in 1..10) {
            println("i = $i, j = $j")
            if (j == 3) return // local return to the caller of kotlinlab.controlflow.main()
        }
        println("this point is unreachable")
    }
    println("this point is unreachable")
}

/**
 * In the example above, the internal loop will be interrupted at the third iteration and return the flow of program execution. This way, the outer loop will never reach further than the first iteration.
 */