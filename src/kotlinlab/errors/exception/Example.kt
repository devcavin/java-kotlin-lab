package kotlinlab.errors.exception

// this function reads an integer and returns it
val readNextInt = fun (): Int {
    print("Read next Int: ")
    return readln().toInt() // this line will throw an exception when the input can't be converted to an integer ie @, hello etc
}

// this function calls the radNextInt() and increment it by 1
val runIncrement = { readNextInt() + 1 }

fun main() {
    // calling the runIncrement()

    val result = runIncrement()
    println(result)
}