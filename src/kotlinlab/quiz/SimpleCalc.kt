package kotlinlab.quiz

import kotlin.math.pow

// arithmetic operation
fun arithmeticOperation(num1: Int, num2: Int, sign: Char) {
    return when (sign) {
        '+' -> println("$num1 + $num2 = ${num1 + num2}")
        '-' -> println("$num1 - $num2 = ${num1 - num2}")
        '*' -> println("$num1 * $num2 = ${num1 * num2}")
        '/' -> println("$num1 / $num2 = ${num1 / num2}")
        '^' -> println("$num1 pow $num2 = ${num1.toDouble().pow(num2)}")
        '%' -> try {
            println("$num1 % $num2 = ${num1 % num2}")
        } catch (e: ArithmeticException) {
            println("Division by zero not allowed, ${e.message}")
        }
        else -> println("Invalid arithmetic operation")
    }
}

fun main() {
    print("Enter the first number: ")
    val input1 = readln().toInt()
    print("Enter the second number: ")
    val input2 = readln().toInt()
    print("Enter the operator (+, -, *, /, ^, %): ")
    val operator = readln().first()

    arithmeticOperation(input1, input2, operator)
}