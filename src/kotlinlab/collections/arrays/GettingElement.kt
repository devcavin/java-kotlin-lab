package kotlinlab.collections.arrays

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val n = 6
    val elem = arr[arr[n]]
    println(elem)

    val array = charArrayOf('!' ,'@', '#', '$')
    /*
    printing the last element from the array
     */
    println(array[array.size -1])
    println(array.last())
    println(array[array.lastIndex])
}