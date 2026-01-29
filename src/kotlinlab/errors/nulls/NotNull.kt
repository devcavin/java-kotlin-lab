package kotlinlab.errors.nulls

import kotlinlab.classes.inheritance.animal.Wolf

/*
The not-null assertion operator, or !!, is different to the other methods for
dealing with nulls that we’ve looked at over the past few pages. Instead of
making sure that your code is safe by handling any null values, the not-null
assertion operator deliberately throws a NullPointerException if something
turns out to be null.
 */

fun main() {
    val w: Wolf? = Wolf()
    val x = w!!.hunger // this will throw a NullPointerException if hunger property happens to be null
    println(x)
}