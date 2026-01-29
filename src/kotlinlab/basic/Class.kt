package kotlinlab.basic

class Car{
    var color = ""
    var model = ""
    var yearOfManufacture = 0
    var milesDrive = 0
    var name = ""

    fun move(){
        println("The car $model is moving")
    }

    fun stop() {
        println("The car $model is now stopped")
    }
}

fun main(){
    val car0 = Car() // instance of class car
    car0.color = "Red"
    car0.model = "BMW"
    car0.yearOfManufacture = 2022
    car0.milesDrive = 250000
    car0.name = "Mustang"
    car0.move()
    car0.stop()


    // another instance of car
    val car1 = Car()
    car1.color = "Blue"
    car1.model = "Ford"
    car1.yearOfManufacture = 2021
    car1.milesDrive = 150000
    car1.name = "F-150"
    car1.move()
    car1.stop()

    // another instance of car
    val car2 = Car()
    car2.color = "White"
    car2.model = "Audi"
    car2.yearOfManufacture = 2020
    car2.milesDrive = 100000
    car2.name = "A4"
    car2.move()
    car2.stop()

    // another instance of car
    val car3 = Car()
    car3.color = "Black"
    car3.model = "Mercedes Benz"
    car3.yearOfManufacture = 2021
    car3.milesDrive = 200000
    car3.name = "S550"
    car3.move()
    car3.stop()

    // another instance of a car
    val car4 = Car()
    car4.color = "Green"
    car4.model = "Tesla"
    car4.yearOfManufacture = 2022
    car4.milesDrive = 300000
    car4.name = "S Plaid"
    car4.move()
    car4.stop()
}