package kotlinlab.controlflow

fun main() {
    val occupiedRows = mutableSetOf<Int>()
    val occupiedCols = mutableSetOf<Int>()

    // Read 3 ships coordinates
    repeat(3) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        occupiedRows.add(x)
        occupiedCols.add(y)
    }

    // Find empty rows (1-5)
    val emptyRows = (1..5).filter { it !in occupiedRows }

    // Find empty columns (1-5)
    val emptyCols = (1..5).filter { it !in occupiedCols }

    // Print results
    println(emptyRows.joinToString(" "))
    println(emptyCols.joinToString(" "))
}
