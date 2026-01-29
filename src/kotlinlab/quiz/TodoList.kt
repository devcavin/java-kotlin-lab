package kotlinlab.quiz

fun main() {
    val todoList = mutableListOf<String>()

    while (true) {
        print("Add a task (or type q/quit/e/exit to stop, v/view to view tasks): ")
        val input = readln()

        when (input.lowercase()) {
            "q", "quit", "e", "exit" -> break
            "v", "view" -> println("Your tasks: $todoList")
            else -> todoList.add(input)
        }
    }
}
