package kotlinlab.basic

// grade calculator

fun main(){
    print("Enter your score: ")
    val grade = readln().toInt()
    when (grade) {
        in 0..<60 -> {
            print("Your grade equals F")
        }
        in 60..<70 -> {
            print("Your grade equals D")
        }
        in 70..<80 -> {
            print("Your grade equals C")
        }
        in 80..<90 -> {
            print("Your grade equals B")
        }
        in 90..100 -> {
            print("Your grade equals A")
        }
        else -> {
            print("Your grade equals unknown")
        }
    }
}

// when is more clean and can be used idiomatically for this task