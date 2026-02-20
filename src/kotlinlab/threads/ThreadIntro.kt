package kotlinlab.threads

class ThreadCreation internal constructor() : Runnable {
    var t: Thread = Thread(this, "Demo Thread")

    override fun run() {
        try {
            for (i in 1..10) {
                println("Child Thread: $i")
                Thread.sleep(500)
            }
        } catch (e: InterruptedException) {
            println("Child Thread Interrupted: ${e.message}")
        }
        println("Exiting the child thread")
    }


    companion object {
        @JvmStatic
        fun main() {
            val newThread = ThreadCreation() // new thread
            newThread.t.start() // start the thread

            try {
                for (i in 5 downTo 2) {
                    println("Main Thread: $i")
                    Thread.sleep(1000)
                }
            } catch (e: InterruptedException) {
                println("Main Thread Interrupted: ${e.message}")
            }
            println("Exiting the main thread")
        }
    }
}