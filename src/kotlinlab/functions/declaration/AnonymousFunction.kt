package kotlinlab.functions.declaration

val anonymousFunction = fun (text: String): String {
    return text // return type can be explicit
} // this is an anonymous function

fun main() {
    println(anonymousFunction("I am anonymous"))
}

/*
 * Key features of anonymous functions:
 *
 *     Use the fun keyword.
 *
 *     You can specify return types explicitly.
 *
 *     return behaves normally, returning from the anonymous function (unlike lambdas, where return can sometimes return from the
 *     enclosing function, depending on context).
 *
 *     Useful when you want more control over scoping, return behavior, or typing.
 */