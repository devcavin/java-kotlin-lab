package kotlinlab.collections.arrays

fun main() {
    // create an array
    val array = arrayOf(1, 2, 3)

    // make an array initialized with nulls
    val nullArray = arrayOfNulls<Int>(3)

    // get the size of an array
    val arraySize = array.size

    // reverse the order of items in the array
    array.reverse()

    // find out if the array contains some element
    array.contains(7) // this will return false for our case

    // calculating the sum of elements in the array (this applies only for numeric elements)
    array.sum() // output: 6

    // finding average of elements( works only with numerical elements ie numbers)
    array.average()

}