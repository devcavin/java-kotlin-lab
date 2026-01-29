package kotlinlab.quiz

fun main(args: Array<String>) {
    if (args.size < 3) {
        // Requirement 1
        main(arrayOf("first", "second", "third"))
    } else {
        // Requirement 2
        args.forEach { println(it) }
    }
}