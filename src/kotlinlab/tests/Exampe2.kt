package kotlinlab.tests

fun f(a: Int, b: Int) = a * b

fun main() {
    val a = 2
    val b = 2
    val expected = 5

    val output = f(a, b)

    if (expected == output) {
        print("True")
    } else{
        print("False")
    }
}