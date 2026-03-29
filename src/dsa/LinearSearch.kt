package dsa

fun linearSearch(data: List<Int>, target: Int): Int {
    if (data.isEmpty()) {
        return -1
    }

    for (i in data.indices) {
        if (data[i] == target) {
            return i
        }
    }
    return -1
}

fun main() {
    val test = linearSearch(listOf(1, 2, 3, 4), 7)

    println(test)
}