package regex.string

/**
 * It's really possible to iterate over characters of a string using a loop
 */

fun main() {
    val scientistName = "Isaac Newton"

    for (i in 0 until scientistName.length) {
        print("${scientistName[i]} ") // print the current character
    }

    // counting the white spaces
    val str = "strings are not primitive types!"

    var count = 0
    for (ch in str) {
        if (Character.isWhitespace(ch))
            count++
    }

    println(count) // 4

    // iterating by indices
    val rainbow = "ROYGCBV"

    for (index in rainbow.indices){
        println("${index+1}: ${rainbow[index]}")
    }

    /*
    While the previous examples showcase direct iteration over strings, you can also convert a string to a character array using toCharArray() and then iterate over that array. This can be useful if you need to modify the characters during iteration
     */

    val message = "Hello, world!"
    val charArray: CharArray = message.toCharArray()

    for (i in charArray.indices) {
        if (charArray[i] == 'o') {
            charArray[i] = 'O' // Replace lowercase 'o' with uppercase 'O'
        }
    }

    println(String(charArray)) // Output: HellO, wOrld!
}