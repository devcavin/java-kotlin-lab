package kotlinlab.classes.dataclass

data class Recipe(val title: String, val isVegetarian: Boolean) {
    var mainIngredient: String = "" // this will be ignored by functions such as equals, copy and componentN etc...
}

fun main() {
    val r1 = Recipe("Thai Curry", false)
    val r2 = Recipe("Chicken Bhuna", false)

    // check equality of the objects
    println(r1 == r2)

    // hashCode()
    println("r1 hashCode = ${r1.hashCode()}, \nr2 hashCode = ${r2.hashCode()}") // data class objects that have been equal generate the same hashCode

    println(r1.toString()) // returns the string representation of the Recipe class object

    /*
    The copy function lets you copy a data object, altering some of its properties.
The original object remains intact.
     */
    val r1Copy = r1.copy(isVegetarian = true) // we have copied r1 instance and altered some of its object

    /*
    Component N(componentN) functions in data classes
     */

    println(r1Copy.component1()) // or we could have fetched it by r1Copy.title too

    // reference check
    println(r1 === r1Copy) //false since their address doesn't point to the same memory location


    // destructuring data classes
    val (r1Title, r1IsVegetarian) = r1
    println(r1Title)
    println(r1IsVegetarian)
}

