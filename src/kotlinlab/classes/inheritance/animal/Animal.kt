package kotlinlab.classes.inheritance.animal

/*
We’re going to add some common properties and functions to an Animal
superclass so that they can be inherited by each of the animal subclasses. This
isn’t meant to be an exhaustive list, but it’s enough to bring the general
idea.

I’ll have four properties:
image: The file name representing an image of this animal.
food: The type of food this animal eats, such as meat or grass.
habitat: The animal’s primary habitat, such as woodland, savannah or water.
hunger : An Int representing the hunger level of the animal. It changes
depending on when (and how much) the animal eats.

And four functions:
makeNoise(): Lets the animal make a noise.
eat(): What the animal does when it encounters its preferred food source.
roam(): What the animal does when it’s not eating or sleeping.
sleep(): Makes the animal take a nap.
 */

/*
Declare a class with keyword open to make it be inherited or overridden
Declare a class with the keyword abstract to prevent it from being instantiated
A class that isn't an abstract class is a concrete class therefore can be instantiated ie var animal = Animal()
 */

/*
Interfaces are used to define a protocol for common behavior so that you can
benefit from polymorphism without having to rely on a strict inheritance
structure

Interfaces are similar to abstract classes in that they can’t be
instantiated, and they can define abstract or concrete functions and properties,
but there’s one key difference: a class can implement multiple interfaces, but
can only inherit from a single direct superclass

So using interfaces can
provide the same benefits as using abstract classes, but with more flexibility
 */


// Interface
interface Roamable {
    val velocity: Int
        get() = 20
    fun roam() {
        println("The Roamable is roaming")
    }
}

// the Animals class
abstract class Animal(
    val image: String,
    val food: String,
    val habitat: String,
) : Roamable {
    val hunger: Int = 10

    abstract fun makeNoise()
    abstract fun eat()

    override fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}

/* Animals subclass */

// Feline subclass
abstract class Feline(
    image: String,
    food: String,
    habitat: String,
) : Animal(image, food, habitat) {
    override fun roam() {
        println("The Feline is roaming")
    }
}

// Canine subclass
abstract class Canine(
    image: String,
    food: String,
    habitat: String,
) : Animal(image, food, habitat) {
    override fun roam() {
        println("The Canine is roaming")
    }
}

// concrete class Hippo
class Hippo(
    image: String = "hippo.png",
    food: String = "grass",
    habitat: String = "water"
) : Animal(image, food, habitat) {
    override fun makeNoise() {
        println("Hippo sound!")
    }
    override fun eat() {
        println("Hippo is eating $food")
    }

    override fun roam() {
        println("Hippo is roaming")
    }
}


/* subclasses of Feline class */

// concrete class Lion
class Lion(
    image: String = "lion.png",
    food: String = "meat",
    habitat: String = "forests"
) : Feline(image, food, habitat) {
    override fun makeNoise() {
        println("Lion sound!")
    }
    override fun eat() {
        println("Lion is eating $food")
    }
}

// concrete class Cheetah
class Cheetah(
    image: String = "cheetah.png",
    food: String = "meat",
    habitat: String = "forests"
) : Feline(image, food, habitat) {
    override fun makeNoise() {
        println("Cheetah sound!")
    }
    override fun eat() {
        println("Cheetah is eating $food")
    }
}

// concrete class Lynx
class Lynx(
    image: String = "lynx.png",
    food: String = "meat",
    habitat: String = "forests"
) : Feline(image, food, habitat) {
    override fun makeNoise() {
        println("Lynx sound!")
    }
    override fun eat() {
        println("Lynx is eating $food")
    }
}

open class Cat(
    image: String = "cat.png",
    food: String = "meat",
    habitat: String = "home"
) : Feline(image, food, habitat) {
    override fun makeNoise() {
        println("Cat sound!")
    }
    override fun eat() {
        println("Cat is eating $food")
    }
}

class Kitten(image: String = "kitten.png", food: String = "meat", habitat: String = "home") : Cat(image, food, habitat) {
    override fun makeNoise() {
        println("Meow! Meow!")
    }

    override fun eat() {
        println("Meow is eating $food")
    }
}

/* subclasses of Feline class */

// concrete class Wolf
class Wolf(
    image: String = "wolf.png",
    food: String = "meat",
    habitat: String = "forests"
) : Canine(image, food, habitat) {
    override fun makeNoise() {
        println("Wolf sound!")
    }
    override fun eat() {
        println("Wolf is eating $food")
    }
}

// concrete class Fox
class Fox(
    image: String = "fox.png",
    food: String = "meat",
    habitat: String = "forests"
) : Canine(image, food, habitat) {
    override fun makeNoise() {
        println("Fox sound!")
    }
    override fun eat() {
        println("Fox is eating $food")
    }
}

// auxiliary class Vet
class Vet {
    fun giveShort(animal: Animal) {
        // do something medical
        animal.makeNoise()
    }
}

// interfaced class Vehicle inheriting from Roamable
class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }
}

fun main() {
    val animals = arrayOf(
        Hippo(),
        Lion(),
        Cheetah(),
        Lynx(),
        Wolf(),
        Fox()
    )

    for (animal in animals) {
        animal.makeNoise()
        animal.eat()
        animal.roam()
        animal.sleep()
        println(animal.image)
        println(animal.habitat)
    }

    val vet = Vet()
    vet.giveShort(Wolf())

    val roamable = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamable) {
        item.roam()

        if (item is Animal) {
            item.makeNoise()
            item.eat()
        }
    }
}