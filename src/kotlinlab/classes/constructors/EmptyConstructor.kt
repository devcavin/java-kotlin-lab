package kotlinlab.classes.constructors

class EmptyConstructor {
    /**
     * When we declare a class with an empty constructor behind the scenes the compiler creates it by adding empty () for us
     * class EmptyConstructor() {}
     *
     * That is why calling it from just EmptyConstructor instead of EmptyConstructor() won't compile
     */
    fun echo() {
        println("This is an empty constructor")
    }
}

fun main() {
    val emptyConstructor = EmptyConstructor()
    emptyConstructor.echo()
}