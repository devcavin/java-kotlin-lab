package kotlinlab.threads

class NewThread(val name: String): Runnable {
    val t: Thread = Thread(this, name)

    override fun run() {
        try {
            for (i in 5 downTo 1) {
                println("$name: $i")
                Thread.sleep(500)
            }
        } catch (e: InterruptedException) {
            println("$name interrupted: ${e.message}")
        }
        println("$name finished")
    }
}

fun main() {
    val t1 = NewThread("T1")
    val t2 = NewThread("T2")
    val t3 = NewThread("T3")

    t1.t.start()
    t2.t.start()
    t3.t.start()

    println("${t1.name} is alive: ${t1.t.isAlive}")
    println("${t2.name} is alive: ${t2.t.isAlive}")
    println("${t3.name} is alive: ${t3.t.isAlive}")

    try {
        /*for (i in 5 downTo 1) {
            println("Main Thread: $i")
            t1.t.join()
            t2.t.join()
            t3.t.join()
            Thread.sleep(1000)
        }*/
        println("Waiting for the threads to finish")
        t1.t.join()
        t2.t.join()
        t3.t.join()
    } catch (e: InterruptedException) {
        println("Main Thread Interrupted: ${e.message}")
    }
    println("${t1.name} is alive: ${t1.t.isAlive}")
    println("${t2.name} is alive: ${t2.t.isAlive}")
    println("${t3.name} is alive: ${t3.t.isAlive}")
    println("Main Thread finished")
    println("${t1.name} priority is ${t1.t.priority}")
    println("${t2.name} priority is ${t2.t.priority}")
    println("${t3.name} priority is ${t3.t.priority}")
    println("${Thread.currentThread().name} priority is ${Thread.currentThread().priority}")
}