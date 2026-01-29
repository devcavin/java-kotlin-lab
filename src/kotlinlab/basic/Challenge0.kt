package kotlinlab.basic

// Building a basic calculator

fun main(){
    print("Enter the first number: ")
    val num0: Int = readln().toInt()
    print("Enter the second number: ")
    val num1: Int = readln().toInt()

    val sum = num0 + num1
    val difference = num0 - num1
    val product = num0 * num1
    val divide = num0 / num1
    val modulus = num0 % num1

    println("The sum  of num0 and num1 is $sum")
    println("The difference between num0 and num1 is $difference")
    println("The product  of num0 and num1 is $product")
    println("Num0 divided by num1 is $divide")
    println("The remainder of num0 and num1 is $modulus")
}