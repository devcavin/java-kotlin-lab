package kotlinlab.collections.maps

import kotlin.collections.iterator

fun main() {
    // maps are key-value type of collections
    // in maps you can have duplicate values but not keys
    // just like lists and sets we have mutable and immutable maps too

    // how to create a map
    val recipeMap = mapOf("Recipe 1" to "Chicken soup", "Recipe 2" to "Quinoa salad", "Recipe 3" to "Thai curry")
    println("Our recipe map is: $recipeMap")

    // check if recipe 1 is in the map
    // we can use contains(), containsKey() to check for keys and containsValue() to check for values

    // you can get a specific value of a key in the map using get() or getValue()

    // looping through a map
    for ((key, value) in recipeMap) {
        println("$key -> $value")
    }

    // recipeMap.forEach { key, value -> println("$key -> $value") }
    // recipeMap.entries.forEach { println("${it.key} -> ${it.value}") }

    // clear() is used to empty the map

    // .keys used to return a list of keys from the map and .values is used to return a list of values
    println(recipeMap.keys)
}