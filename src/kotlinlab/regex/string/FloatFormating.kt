package kotlinlab.regex.string

/**
 * There are various format specifiers for floating-point numbers, such as Double and Float. For normal decimal representation, we use %f. It has all the formatting properties of %d, with the addition of an indicator to control the number of the decimal places.
 *
 * If N and P are positive integers, then %N.Pf or %.Pf denote that the number should have P decimal digits. Note that the number is also rounded up. If P is larger than the number of actual decimal digits, then trailing zeros are added so their number is exactly P
 *
 * In order to get a string represented in scientific notation, the %e (lower case "e") or %E (upper case "E") format specifiers should be used. These specifiers are incompatible with the property
 */

fun main() {
    val double1 = 1234.5678
    val double2 = -1234.5678

    println(String.format("%f", double1))      //1234.567800
    println(String.format("%f", double2))      //-1234.567800
    println(String.format("% f", double1))     // 1234.567800
    println(String.format("% f", double2))     //-1234.567800

    println(String.format("%(f", double1))     //1234.567800
    println(String.format("%(f", double2))     //(1234.567800)
    println(String.format("%+f", double1))     //+1234.567800
    println(String.format("%,f", double1))     //1,234.567800

    println(String.format("%-15f", double1))   //1234.567800
    println(String.format("%015f", double1))   //00001234.567800
    println(String.format("%15.2f", double1))  //        1234.57
    println(String.format("%.3f", double1))    //1234.568
    println(String.format("%.6f", double1))    //1234.567800

    println(String.format("%e", double1))      //1.234568e+03
    println(String.format("%E", double2))      //-1.234568E+03
    println(String.format("%15.2e", double1))  //       1.23e+03
    println(String.format("%.9E", double1))    //1.234567800E+03
}