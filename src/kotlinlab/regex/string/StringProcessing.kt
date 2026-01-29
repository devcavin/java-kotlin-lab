package kotlinlab.regex.string

/**
 * In some sense, a string looks like a list of characters. You can iterate both over strings and lists. However, sometimes you need to turn a string into a list
 *
 * A string can be separated by delimiters to a list of strings. To perform this, call the method split() , it divides a string into substrings by a separator
 * The " " delimiter for example, splits a string into separate words by spaces
 *
 * The method returns a List of all the substrings. The List is similar to MutableList, but you cannot reassign elements in the List and you cannot resize the List. You can easily convert List to MutableList and vice versa with toMutableList() and toList() functions.
 */

fun main() {
    val sentence = "a long text"
    val wordsList: List<String> = sentence.split(" ") // ["a", "long", "text"]

    val mutableWordList = sentence.split(" ").toMutableList() // MutableList ["a", "long", "text"]

    val number = "+1-213-345-6789"
    val numberParts = number.split("-") // ["+1", "213", "345", "6789"]

    val text = "That's one small step for a man, one giant leap for mankind."
    val textParts = text.split(",") // ["That's one small step for a man", " one giant leap for mankind."]

    val anotherText = "I'm gonna be a programmer"
    val anotherTextParts = text.split(" gonna be ") // ["I'm", "a programmer"]
}