package regex.string

/**
 * The main format specifier for integers (Int), including Long, Short, Byte, and BigInteger, is %d, which has the following additional formatting properties:
 *
 * %0Nd
 *
 *
 * Leading zeros fill in the indicated width.
 *
 * %,d
 *
 *
 * Thousands divisor.
 *
 * %+d
 *
 *
 * Number always signed, even if positive.
 *
 * % d
 *
 *
 * For a positive number, insert one leading space.
 *
 * %(d
 *
 *
 * Put a negative number in parentheses, without the minus sign.
 *
 * Note that - is incompatible with 0
 */

fun main() {
    val int1 = 1234
    val int2 = -4567

    println(String.format("%d", int1))       //1234
    println(String.format("%8d", int1))      //    1234
    println(String.format("%-8d", int1))     //1234
    println(String.format("%+d", int1))      //+1234

    println(String.format("%+d", int2))      //-4567
    println(String.format("%09d", int1))     //000001234
    println(String.format("%,10d", int1))    //     1,234
    println(String.format("%+,010d", int1))  //+00001,234

    println(String.format("%-+,10d", int1))  //+1,234
    println(String.format("% d", int1))      // 1234
    println(String.format("% d", int2))      //-4567
    println(String.format("%(d", int2))      //(4567)

    /**
     * There are also the %o and %x (for lower case) or %X (for upper case) format specifiers for integers (including Long, Short, Byte, and BigInteger) – they are used for formatting numbers as octal and hexadecimal respectively. Note that the normal integer + , ,, (space), and ( formatting properties are incompatible with these format specifiers.
     *
     * The # formatting indicator can be used in order to lead an octal number with 0 or a hexadecimal number with 0x
     */

    val int3 = 3465
    val int4 = -7896

    println(String.format("%o", int3))     //6611
    println(String.format("%o", int4))     //37777760450
    println(String.format("%#o", int3))    //06611

    println(String.format("%8o", int3))    //    6611
    println(String.format("%-8o", int3))   //6611
    println(String.format("%09o", int3))   //000006611

    println(String.format("%x", int3))     //d89
    println(String.format("%X", int4))     //FFFFE128
    println(String.format("%#X", int3))    //0XD89

    println(String.format("%8x", int3))    //     d89
    println(String.format("%-8X", int3))   //D89
    println(String.format("%09X", int3))   //000000D89
}