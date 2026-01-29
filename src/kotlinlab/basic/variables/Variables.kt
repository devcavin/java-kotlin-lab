package kotlinlab.basic.variables

fun main(){
    // variables are containers or holders of data that need to be stored
    // variables declared inside the kotlinlab.main function are said to be local while those declared outside are said to be global that is they have a wider scope
    val name = "Kotlin"
    println("I love coding in $name!")

    var a  = 5
    println("The initial value of a is $a")
    val s = 'c'
    println("The value of s is $s")

    a = 7 // var is used to declare mutable variables
    // val is used to declare immutable variables
    println("The value of a after the reassignment is $a")


    /** it is recommended to declare all variables as immutable unless otherwise
     * only if necessary
     */
}