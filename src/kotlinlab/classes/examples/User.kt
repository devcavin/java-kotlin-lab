package kotlinlab.classes.examples

class User(val name: String, age: Int) {
    init {
        println("User $name created, age $age")
    }
}

fun main() {
    val user = User("Cavin", 21)
    println("Hello, ${user.name}")
}
