package kotlinlab.threads.synchronization

class CallMe {
    // @Synchronized // introduces synchronization
    fun call(message: String) {
        print("[$message")

        try {
            Thread.sleep(1000)
        } catch (e: InterruptedException) {
            println("Interrupted: ${e.message}")
        }
        print("]\n")
    }
}

class Caller(
    val message: String,
    val target: CallMe
): Runnable {
    val t = Thread(this)
    override fun run() {
        target.call(message)
    }
}

fun main() {
    val callMe = CallMe()

    val t1 = Thread(Caller("Hello", callMe))
    val t2 = Thread(Caller("Synchronization", callMe))
    val t3 = Thread(Caller("World", callMe))

    // start the threads
    t1.start()
    t2.start()
    t3.start()

    // wait for the threads to finish
    t1.join()
    t2.join()
    t3.join()
}