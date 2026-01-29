package kotlinlab.tests

class CalculatorTest {
    fun addTest() {
        val result = Calculator.add(1, 2)
        println(assert(result == 3))
    }
}

fun main() {
    CalculatorTest().addTest()
}