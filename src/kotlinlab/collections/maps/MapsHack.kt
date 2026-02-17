package kotlinlab.collections.maps

class Person(val name: String, val age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Person) return false

        if (age != other.age) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = age
        result = 31 * result + name.hashCode()
        return result
    }
    override fun toString(): String {
        return "$name, $age"
    }
}

data class Diamond(val name: String)

fun main() {
    val shop: MutableMap<Person, Diamond> = mutableMapOf()
    shop[Person("Alice", 29)] = Diamond("London")
    println(shop[Person("Alice", 29)])
}