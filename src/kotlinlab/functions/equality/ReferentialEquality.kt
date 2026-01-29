package kotlinlab.functions.equality

/**
 * Referential equality of variables means that these variables point to the same object.
 *
 * You can use the operators === and !== to check referential equality.
 */

// Example

fun main() {
    var d1: Double = 1.5
    val d2 = d1
    println(d1 === d2) // true
    d1 += 1            // d1 is 2.5 now
    println(d1 === d2) // false


    val list1: MutableList<Int> = mutableListOf()
    val list2: MutableList<Int> = list1
    list1.add(1)
    println("list1 $list1") // list1 [1]
    println("list2 $list2") // list2 [1]
    list2.add(5)
    println("list1 $list1") // list1 [1, 5]
    println("list2 $list2") // list2 [1, 5]
}