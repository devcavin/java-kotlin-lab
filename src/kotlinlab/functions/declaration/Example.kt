package kotlinlab.functions.declaration

// some simple fun that add given integer numbers
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val sum0 = sum(3, 4) // assign the function to a variable and call it
    println(sum0) // output the final result from the function

    // say greeting
    println(sayGreeting())

    // function with no return type
    println(funWithoutReturnType())
}

// parameters are optional and a functions doesn't tie you to provide them ie the function below has no parameters

fun sayGreeting(): String {
    return "Hello, how are you doing?"
}

// again functions doesn't need to have a return type it's optional

fun funWithoutReturnType() {
    "This function has no return type"
}