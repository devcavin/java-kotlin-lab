package kotlinlab.basic.types

fun main() {
    val note = "h5Ai3^_&1f!?r90i-_e*~nу]d"

    /*val message = mutableListOf<String>()
    for (i in note.indices) {
        if (i % 3 == 0) {
            message.add(note[i].toString())
        }
    }*/

    for (i in note.indices) {
        if (i % 3 == 0) {
            print(note[i])
        }
    }

    /*val decoded = note.filterIndexed { index, _ -> index % 3 == 0 }
    println(decoded)*/
}