package kotlinlab.tests

class Calc {
    fun sum(numbers: List<Int>?): Int {
        if (numbers == null) {
            return 0
        }

        var sum = 0
        for (number in numbers) {
            sum += number
        }
        return sum
    }
}