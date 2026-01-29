package kotlinlab.controlflow

fun main() {
    /**
     * What is a label? Technically, it's just an identifier with the @ sign at the end, for example: loop@, kotlin@. You can use almost any word with it, apart from the reserved words in Kotlin. What do you need labels for? Well, you can add your label to a loop
     * loop@ for(i..4) {
     * TODO("Do something")
     * }
     */

    // example
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i, j = $j")
            if (j == 3) break@loop
        }
    }

    /**
     * So, labels help us break not only the inner loop but also the outer one. Once again, break with a label terminates the execution of the labeled loop.
     */

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            for (k in 1..3) {
                if (k == 2) continue@loop
                println("i = $i, j = $j, k = $k")
            }
        }
    }

    /**
     * With the label, we changed the default behavior of the continue keyword. Instead of skipping the execution of the inner loop at the second iteration and continuing with the next iteration, we returned to the outer loop and continued its execution. Without labels, such a trick wouldn't be possible
     */

    // before and after Kotlin 1.4

    // before
    Loop@ for (i in 1..10) {
        when (i) {
            3 -> continue@Loop
            6 -> break@Loop
            else -> println(i)
        }
    }

    // after
    for (i in 1..10) {
        when (i) {
            3 -> continue
            6 -> break
            else -> println(i)
        }
    }
}