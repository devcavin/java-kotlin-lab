package kotlinlab.collections.lists

fun main() {
    // creating a mutable list
    val mutableShopping = mutableListOf("Tea", "Eggs")

    /**
     * Mutable list provide more functions like add,remove, sort, arrange elements
     */

    // add element(s) to a mutable list
    mutableShopping.add("Milk")

    // can add an element at  specified index
    mutableShopping.add(1, "Orange")

    // add a collection of elements
    mutableShopping.addAll(listOf("Mangoes",  "Bananas", "Guava", "Watermelon", "Apple")) // takes lists or sets; for arrays you'll have to convert it to lists

    // removing items from a list
    mutableShopping.remove("Eggs") // remove the specified element on the argument

    // removing an element from a given index, .removeAt(indexOfTheElement)
    mutableShopping.removeAt(2)

    // removing all elements from the list that matches a given predicate or string
    mutableShopping.removeAll {  it.contains("Eggs") } /* removes all elements that matches "Eggs" */

    // removing all elements(clearing) the list
    mutableShopping.clear() // this empties the list

    // replacing an item in a list
    mutableShopping[0] = "Orange"

    // changing the order of items in a list
    mutableShopping.sort()
    mutableShopping.reverse()

    // shuffling randomize the order of items
    mutableShopping.shuffle()

    // retainAll function retains all the items that are held in another collection and removes everything else
    mutableShopping.retainAll(listOf("Cookies", "sugar", "tea"))

    // copying a given list
    val copyOfMutableShopping = mutableShopping.toList() // makes a copy of it as immutable .toMutableList() will make a mutable copy of it

    // getting the size of a list
    mutableShopping.size
}
