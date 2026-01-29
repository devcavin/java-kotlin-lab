package kotlinlab.classes.gettersandsetters

/**
 * Getters and setters let you, well, get and set property values
 * A getter’s sole purpose in life is to send back a return value, the value of whatever it is that
 * particular getter is supposed to be getting.
 * And a setter lives and breathes for the
 * chance to take an argument value, and use it to set the value of a property
 *
 * NOTE: Writing custom getters and setters lets you protect your property values, and
 * they give you more control over what values are returned or assigned
 */

class Dog(val name: String, var weight: Double, breedParam: String) {
    var activities = arrayOf("Walks")
    val breed = breedParam.uppercase()

    // getter
    val weightInKgs: Double
        get() = weight / 2.2 // this adds a custom get that returns the actual weight divided by 2.2 hence the weight in KGs
}

class Person(val name: String, ageParam: Int, val gender: String ) {
    var age = ageParam
        set(value) {
            field = if (value < 0) 0 else value
        } // this adds a custom setter to the weight property and controls how it operates

    // how to add both setter and getter

}

/**
 * Technically, getters and setters are optional parts of the property declaration
 */

/**
 * Removing direct access to a property’s value by wrapping it in getters and
 * setters is known as data hiding
 */

/*
Adding a getter and setter to every property means that there’s a standard
way of accessing that property’s value. The getter handles any requests to
get the value, and the setter handles any requests to set it. So if you want to
change your mind about how these requests are implemented, you can do so
without breaking anybody else’s code.
 */
