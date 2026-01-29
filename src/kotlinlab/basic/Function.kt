package kotlinlab.basic

fun sum(a: Int, b: Int): Int {
    return Math.addExact(a, b)
}

fun main(){
    print("Enter the value of a: ")
    val a = readln().toInt()
    print("Enter the value of b: ")
    val b = readln().toInt()

    sum(a, b)
    println("The sum of $a and $b is ${sum(a, b)}")
}