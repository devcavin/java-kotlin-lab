package kotlinlab.bigonotation

fun main() {
    // Work = n loops inside n loops (loops quadratically) O(n^2) example in bubble sort, nested for-loops

    // some square function
    fun square(n: Int) {
        for (i in 0..n) {
            for (j in 0..n) {
                println("$i, $j")
            }
        }
    }

    square(5)
}