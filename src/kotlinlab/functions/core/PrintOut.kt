package kotlinlab.functions.core

/*
var counter = 6
fun main() {
    if(counter == 0) return
    counter -= 1
    kotlinlab.main(counter)
    kotlinlab.main()
}

fun main(args: Int) {
    print(args)
}*/


/*
fun main(args: Array <String>) {
    print(1)
}

fun main() {
    print(2)
}*/


fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Invalid number of program arguments")
        return
    }

    for (i in args.indices) {
        val argument = args[i]
        println("Argument ${i + 1}: $argument. It has ${argument.length} characters")
    }
}
