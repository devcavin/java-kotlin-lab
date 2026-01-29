package kotlinlab.errors.nulls

class Duck(val height: Int? = null) {
    fun quark() {
        println("Quark! Quark!")
    }
}

class MyDucks(var myDucks: Array<Duck?>) {
    fun quark() {
        for (duck in myDucks) {
            // duck?.let { it.quark() } // safe call is more idiomatic
            duck?.quark()
        }
    }

    fun totalDuckHeight(): Int {
        var h: Int = myDucks.size
        for (duck in myDucks) {
            h += duck?.height ?: 0
        }
        return h
    }
}