package kotlinlab.scope

fun first() {
    fun second() {
        return first()
    }
}

fun main() {
    first()
    // second() // is out of scope since it's local to the first()

    // some blocked scope
    if(true) {
        val eight = 8 // this is only local to the if block of the if-else
    } else {
        // ...
    }
}