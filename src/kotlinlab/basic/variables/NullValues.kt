package kotlinlab.basic.variables

// Kotlin too like other programming allows null value assignment

fun main(){
    val b: String? = "Kotlin"
    println(b)

    val l = b?.length // safe approach of handling NPE this will confirm the checks and ignore crashes

    val m = b!!.length // unsafe approach of handling NPE -> use when uncertain that the value won't be null and if it is null the system will throw a NPE which might lead to crashes

    println(l)
    println(m)
}