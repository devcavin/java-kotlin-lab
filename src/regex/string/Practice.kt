package regex.string

/*
fun main() {
    val str1 = "aaabbcccdaa"
    var str2 = " "

    for (ch in str1) {
        if (ch != str2.last()) {
            str2 += ch
        }
    }

    println(str2)
}*/

/*
fun main() {
    val inputText = readln().lowercase()
    if (inputText.contains("the")) {
        println(inputText.indexOf("the"))
    } else {
        println(-1)
    }
}*/

/*
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the string s and the integer n
    if (scanner.hasNext()) {
        val s = scanner.next()
        val n = scanner.nextInt()

        // if n is greater than length, print unchanged
        if (n > s.length) {
            println(s)
        } else {
            // Move first n characters to the end
            // 1. Get substring from n to the end
            // 2. Get substring from 0 to n
            // 3. Concatenate them
            val result = s.substring(n) + s.substring(0, n)
            println(result)
        }
    }
}*/

fun main() {
    val string = readln()
    val index = readln().toInt()
    try {
        println(string[index])
    } catch (e: StringIndexOutOfBoundsException) {
        println("Out of bounds!")
    }
}