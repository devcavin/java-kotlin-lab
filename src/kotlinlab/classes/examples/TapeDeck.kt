package kotlinlab.classes.examples

class TapeDeck {
    var hasRecorder = false

    fun playTape() {
        println("Tape playing...")
    }

    fun recordTape() {
        if (hasRecorder) println("Tape recording...")
    }
}

class DVDPlayer(val hasRecorder: Boolean) {
    fun playDVD() {
        println("DVD playing...")
    }

    fun recordDVD() {
        if (hasRecorder) println("DVD recording...")
    }
}

fun main() {

    // playDeck
    val tape = TapeDeck()
    tape.hasRecorder = true // assigning a new value to the property hasRecorder
    tape.playTape()
    tape.recordTape()

    // DVDPlay
    val dvdPlayer = DVDPlayer(true)
    dvdPlayer.playDVD()
    dvdPlayer.recordDVD()
}