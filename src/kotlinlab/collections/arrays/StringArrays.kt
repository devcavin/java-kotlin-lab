package kotlinlab.collections.arrays

/**
 * We can use arrays to store a bunch of data of the same type, and String is no exception. In this topic, we will take a close look at string arrays and cover the essential basics from initializing an array to changing its contents. Note, you can do the same with any other types.
 *
 * Kotlin does not provide a special function to create an array of strings, so you need to use the function arrayOf which is already familiar to you
 *
 * Basically, the function arrayOf is universal: you can use it to collect any type of data in an array, including String
 *
 *
 */
fun main() {
    val stringArray = arrayOf("array", "of", "strings")

    /**
     * You can also initialize an empty array to be filled with strings later. For this, you need the function emptyArray
     */

    val newEmptyArray = emptyArray<String>()

    /**
    *  Since everything, you already know about arrays still applies, you can access a certain element by its index:
    */

    val stringArray1 = arrayOf("sagacity", "and", "bravery")
    print(stringArray1[2])   // bravery

    /**
     * Remember that indexing starts with 00. The index of the last element will equal length−1length−1.
     * You can set an array element in the same way:
     */

    stringArray[0] = "smart"
    print(stringArray[0])   // smart

    /**
     * Now you know how to create and fill a string array and access its elements.
     *
     * To see what we get as a result, and, for example, print a string array, use the familiar function joinToString():
     */

    val southernCross = arrayOf("Acrux", "Gacrux", "Imai", "Mimosa")
    println(southernCross.joinToString())   //  Acrux, Gacrux, Imai, Mimosa

    /**
     * Let’s look at a couple of things you might want to know about working with several string arrays.
     *
     *     String arrays can be added
     *
     * You can concatenate several arrays as shown in the following example
     */

    val stars = arrayOf("Ginan", "Mu Crucis")

    val newArray = southernCross + stars
    println(newArray.joinToString())    //  Acrux, Gacrux, Imai, Mimosa, Ginan, Mu Crucis

    /**
     * You cannot use the operators == and != to compare arrays because they simply do not compare their contents. With arrays, use the function contentEquals() instead
     */

    val firstArray = arrayOf("result", "is", "true")
    val secondArray = arrayOf("result", "is", "true")
    val thirdArray = arrayOf("result")

    println(firstArray.contentEquals(secondArray))  //  true
    println(firstArray.contentEquals(thirdArray))   //  false


    /**
     * No matter if you're using val or var, you can edit the values of the existing elements through their index
     */

    southernCross[1] = "star"
    stars[1] = "star"

    println(southernCross[1]) // star
    println(stars[1]) // star
}