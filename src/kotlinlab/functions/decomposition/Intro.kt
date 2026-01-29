package kotlinlab.functions.decomposition

/**
 * Functional decomposition is the process of dividing a complex program into a number of functions(chunks)
 */

// Example of un decomposed program

/**
fun main() {
    // ...
    val password = "76543210"
    val speakersState = setOf("on", "off")
    var lampState: String
    var doorState: String
    // ...

    // reading the password
    println("Enter password: ")
    val passwordInput = readln()

    // checking if the password is correct
    if (passwordInput != password) {
        println("Incorrect password!")
    } else {
        // asking the user what they want to do
        println("Choose the object: 1 – speakers, 2 – lamp, 3 – door")
        val action = readln()

        when (action) {
            "1" -> {
                // asking the user about the speakers
                for (speaker in speakersState) {
                    when (speaker) {
                        "on" -> {
                            // ...
                        }
                        "off" -> {
                            // ...
                        }
                        else -> {
                            // ...
                        }
                    }
                }
            }
            "2" -> {
                // asking the user about the lights...
            }
            "3" -> {
                // asking the user about the door...
            }
            else -> {
                // ...
            }
        }
    }
} */


// the decomposed function

// check password
fun checkPassword(passwordInput: String): Boolean {
    val password = "76543210"
    return password == passwordInput
}

// check the music
fun checkMusic(speakerStateInput: String) {
    val speakerState = setOf("on", "off")

    for (speaker in speakerState) {
        when (speaker) {
            "on" -> "Music is on"
            "off" -> "Music is off"
            else -> "Invalid speaker option"
        }
    }
}

// door state checker
fun checkDoor(doorStateInput: String) {
    val doorState = setOf("open", "close")
    for (door in doorState) {
        when (door) {
            "open" -> "Door is open"
            "close" -> "Door is closed"
            else -> "Invalid door option"
        }
    }
}

// function to hold the smart home functionalities
fun checkAction() {
    // check password validity for access to the smart house
    if (checkPassword(readln())) {
        // do some actions ie
        checkMusic(readln()) // check if the music is on
        checkDoor(readln()) // check if the door is open or closed
    }
}

fun main() {
    println(checkAction())
}


// this was just a draft, there is room for adjusting the logic and structuring better the program