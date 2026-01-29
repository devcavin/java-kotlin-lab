package kotlinlab.koans

/*** STEPS ***/
/*
CREATE Class Item: Constructors name: String, price: Double, quantity: Int
CREATE Class ShoppingCart: Holds a list of Items, methods for calculateTotalCost() to return the total cost of items in
the shopping cart
 */

class Item(
    val name: String,
    val price: Double,
    val quantity: Int
)

class ShoppingCart( val listOfItems: List<Item>) {
    // method to calculate the total cost of items in the shopping cart
    fun calculateTotalCost(): Double {
        return listOfItems.sumOf { it.price * it.quantity }
    }
}