package collections.arrays

/**
 * However, there is a great difference between val and var when it comes to reassignment. When you have a var array, you can change it by adding new elements to it
 */

fun main() {
    var southernCross = emptyArray<String>()

    // What good is an empty array? Let's fill it
    southernCross += "Acrux"
    southernCross += "Gacrux"
    southernCross += "Imai"
    println(southernCross.joinToString())   // Acrux, Gacrux, Imai

    // Even if your array is not empty to begin with, you can still add elements in the same way
    var southernCrosses = arrayOf("Acrux", "Gacrux", "Imai")
    southernCrosses += "Mimosa"
    println(southernCrosses.joinToString())  //  Acrux, Gacrux, Imai, Mimosa

    /**
     * Just like that, we’ve changed the content of the array by adding new elements. However, there’s one very important point to be made.
     *
     * In Kotlin, the arrays are in a way unchangeable. Even if the array is declared with var, it cannot really be edited. In both examples, the array southernCross was actually re-created. In fact, we literally deleted the array and created another one instead.
     *
     * So, we can add new elements if the array is declared as var. If you're using val, that is not possible:
     */

    val southernCrossArray = arrayOf("Acrux", "Gacrux", "Imai", "Mimosa")
    //southernCrossArray += "Ginan" // will not compile
}