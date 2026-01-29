package kotlinlab.collections.lists

fun main() {
    val shopping = listOf("Milk", "Eggs", "Tea") // creating a list
    println(shopping[0]) // accessing the elements of a list

    // looping through a list
    println("\nLooping with for")
    for (item in shopping) println(item)

    println("\nLooping with forEach method")
    shopping.forEach { item -> println(item) }

    // checking if a list contains a given item
    val containsEggs = shopping.contains("Eggs")
    println("\nDoes shopping contains eggs? $containsEggs")

    // containsAll method accepts more than 1 argument
    shopping.containsAll(listOf("Milk", "Eggs", "Tea")) // the collection can either be list or set

    // lists has a method for getting the index of a given item, if not found returns -1
    println("\nWhat is the index of bananas from the shopping list? ${shopping.indexOf("Bananas")}") // output: -1 since we don't have bananas on the shopping list
}
