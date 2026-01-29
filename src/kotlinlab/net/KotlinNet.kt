package kotlinlab.net

import java.net.InetAddress

fun main() {
    // Get localhost information
    val localhost = InetAddress.getLocalHost()
    println("Localhost name is ${localhost.hostName}")
    println("Localhost IPV4 address is ${localhost.hostAddress}")

    val inetAddress = InetAddress.getByName("www.kotlinlang.org")
    // println(inetAddress.hostName)
    println("Kotlinlang IPV4 address is ${inetAddress.hostAddress}")
}