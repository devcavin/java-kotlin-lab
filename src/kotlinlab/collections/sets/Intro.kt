package kotlinlab.collections.sets

fun main() {
    // sets are like lists but doesn't allow duplicate items and unordered

    // to create a set we can call a function setOf or mutableSetOf

    val friendSet = setOf("Jim", "Sue", "Nick") // creating an immutable set
    println(friendSet)

    // checking if the set contains a given item
    val isFredMyFriend = friendSet.contains("Fred")
    println(isFredMyFriend) // output: false

    // looping within a set
    for (i in friendSet) print("$i, ")
}