package kotlinlab.controlflow

fun main() {
    for (i in 1..4) {
        for (j in 1..4) {
            if (j == 2) continue // you want to ignore j = 2
            if (i <= j) break    // you will print the string if i is greater than j
            println("i = $i, j = $j")
        }
        println("Finished to examine i = $i")
    }
}