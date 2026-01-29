package kotlinlab.coroutines

import kotlin.concurrent.thread

fun main() {
    println("I am on thread ${Thread.currentThread().name}: thread id ${Thread.currentThread().threadId()}")
    thread {
        println("I am on thread ${Thread.currentThread().name}: thread id ${Thread.currentThread().threadId()}")
    }

    thread {
        println("I am on thread ${Thread.currentThread().name}: thread id ${Thread.currentThread().threadId()}")
    }
}