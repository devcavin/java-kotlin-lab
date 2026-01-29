package kotlinlab.classes.dataclass

data class Mushroom(
    // primary constructors
    val size: Int,
    val isMagic: Boolean
) {
    // secondary constructor
    constructor(isMagicParam: Boolean) : this(0, isMagicParam) {
        // body carrying the code that is compiled when the secondary constructor is called
        TODO("Do something else")
    }
}
