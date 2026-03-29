package kotlinlab.threads

import kotlin.concurrent.thread

fun main() {
    println("Compiling thread: ${Thread.currentThread().name}")
    thread {
        println("Compiling thread: ${Thread.currentThread().name}")
    }
}