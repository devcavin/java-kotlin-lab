package kotlinlab.collections.maps

fun main() {
    val recipeMap = mutableMapOf("Recipe1" to "Chicken soup", "Recipe2" to "Quinoa salad")

    // adding to a map
    recipeMap["Recipe3"] = "Thai curry" // recipeMap.put("Recipe3", "Thai curry")

    // putAll() is used to bulk add from another map

    // remove() used to remove items from a map
    // replaceAll() is used for bulk replacing the items from a map from a given point
}