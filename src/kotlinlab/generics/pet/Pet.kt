package kotlinlab.generics.pet

abstract class Pet(val name: String)

class Cat(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Fish(name: String) : Pet(name)