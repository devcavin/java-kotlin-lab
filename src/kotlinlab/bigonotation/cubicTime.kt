package kotlinlab.bigonotation

fun main() {
    // Work = n loops inside n loops inside n loops again (loops cubically) O(n^3) example in nested for-loops

    // some cube function
    fun cube(n: Int) {
        for (i in 0..n) {
            for (j in 0..n) {
                for (k in 0..n) {
                    println("$i, $j, $k")
                }
            }
        }
    }

    cube(5)
}