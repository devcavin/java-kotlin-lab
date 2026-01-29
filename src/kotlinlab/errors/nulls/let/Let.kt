package kotlinlab.errors.nulls.let

import kotlinlab.classes.inheritance.animal.Wolf

/*
When you use nullable types, you may want to execute code if (and only if) a
particular value is not null
 */

// using let to streamline functions
fun getAlphaWolf(): Wolf? {
    return Wolf()
}

fun main() {
    val w: Wolf? = Wolf()
    w?.let { println(it.hunger) } // will print the value of hunger as long as it isn't null

    // using let for arrays
    val myArray = arrayOf("Hello", null, "test", "string")

    // looping through the array
    for (item in myArray) {
        item?.let { println(it) }
    }

    val alpha = getAlphaWolf()
    if (alpha != null) {
        alpha.eat()
    } else {
        println("Null")
    }

    getAlphaWolf()?.eat()
    // getAlphaWolf()?.let { it.eat() } // let would work but safe call is more idiomatic
}