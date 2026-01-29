package kotlinlab.functions.declaration

/**
 * In Kotlin, functions form the bedrock of your code. They define blocks of code that you can execute and reuse throughout your program. A function is a sequence of instructions put together to operate. In a way, it is a kind of subprogram.
 *
 * Functions play a critical role because they organize code into manageable chunks. They enable code reuse, lighten redundancies, and enhance readability. When you wrap specific operations inside functions, you build more modular and maintainable codebases.
 *
 * Invoking - The act of calling or using a function when needed
 *
 */

// Basic syntax

fun funName(params: Any): Any {
    // function body
    return params
}

fun main() {

    // funName() can take any type of data
    println(funName("John"))
    println(funName(5))
}