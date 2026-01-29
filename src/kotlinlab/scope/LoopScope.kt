package scope

fun main() {
    var outer = 5
    while (outer < 10) {
        var inner = 10
        inner *= 2
        print(inner)
        outer++
    }  // prints 2020202020

    // outside the while loop
    // print(inner)  // Unresolved reference: inner
}