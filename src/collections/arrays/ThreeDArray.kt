package collections.arrays

fun main() {
    val threeDArray = Array(3) {
        Array(3) {
            IntArray(3) { 0 }
        }
    }

    println(threeDArray.contentDeepToString())
}