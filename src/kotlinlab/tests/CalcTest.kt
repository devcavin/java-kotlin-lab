package kotlinlab.tests

class CalcTest(
    private val calc: Calc
) {
    fun testSum() {
        val collection: List<Int>? = null
        assert(calc.sum(collection) == sum())
    }
}

fun main() {
   val calcTest = CalcTest(Calc())
    println(calcTest.testSum())
}