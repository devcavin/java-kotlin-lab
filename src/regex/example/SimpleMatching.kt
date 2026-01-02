package regex.example

fun main() {
    val regex: Regex = "Cat".toRegex() // creating a regex pattern

    // matching the regex against some string
    println(regex.matches("Cat")) // true
    println(regex.matches("Cats")) // false
    println(regex.matches("CAT")) // false: but if we include ignore case property it matches

    val dogRegex = "Dog".toRegex(RegexOption.IGNORE_CASE)
    println(dogRegex.matches("DOG")) // true

    println(dogRegex.matchAt("The dog is eating.", 4)?.value)

    /**
     * when our regex is just a sequence of simple characters, the result will be true only when the string matches the regex perfectly
     */
}