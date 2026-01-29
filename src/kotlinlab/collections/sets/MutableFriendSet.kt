package kotlinlab.collections.sets

fun main() {
    // mutable set is a subtype of set that allows you to add and remove values
    val mFriendSet = mutableListOf("Jim", "Sue")
    println("Our initial set is: $mFriendSet")

    // adding an item to the set
    mFriendSet.add("Nick")
    println("Our set after adding a friend is: $mFriendSet")

    // removing values from a set
    if (mFriendSet.contains("John")) mFriendSet.remove("John") else println("John isn't our friend yet!")
    println("Our set after removing a friend is: $mFriendSet")

    // addAll(), removeAll() and retainAll() functions do a bulk function of adding, removing or retaining from a given collection ie list, array or set

    // sort() or reverse() functions can be used to arrange items in a set respectively

    // clear() is used to empty the set

    // looping through a set
    mFriendSet.forEach { println(it) }
    // for (i in mFriendSet) println(i)
}