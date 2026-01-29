package basic.variables

/**
 * Boolean values are used to store value that are either true or false(1, 0)
 *
 * syntax;
 * val myBool: Bool = true
 */

fun main(){
    val isTrue = true
    val isFalse = !isTrue // you can just invoke false boolean directly by

    /*
    consider a variable lets say rainingToday and initialize it with false as below
    val isRaining = false

    Then we can give a true version of it by invoking ! symbol before it with a variable maybe isSunny

    val isSunny = !isRaining // this will make isSunny true
     */
    println("The variable isTrue is '$isTrue' while variable isFalse is '$isFalse'")
}