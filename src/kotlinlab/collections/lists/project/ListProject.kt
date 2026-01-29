package kotlinlab.collections.lists.project

fun main() {
    val mShoppingList = mutableListOf("Tea", "Eggs", "Milk") // original list(mutable)
    println("Original shopping list: $mShoppingList")

    // extra shopping list
    val extraShoppingList = listOf("Cookies", "sugar", "Eggs")
    mShoppingList.addAll(extraShoppingList)
    println("\nThe shopping list after adding the extra list: $mShoppingList")

    if  (mShoppingList.contains("Eggs")) mShoppingList[mShoppingList.indexOf("Eggs")] = "Sausage" // set the value of the last eggs index to sausage

    // sorting the list
    mShoppingList.sort()
    println("\nThe sorted shopping list: $mShoppingList")

    // reversing the list
    mShoppingList.reverse()
    println("\nThe shopping list after reverse: $mShoppingList\n")

    mShoppingList.forEach { println(it) }
}