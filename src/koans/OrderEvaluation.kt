package koans

private const val TOTAL_MINIMUM_ITEMS_QUANTITY_REQUIRED = 1

/*data class Item(
    val name: String,
    val quantity: Int,
    val price: Double,
)*/

data class Order(
    val id: Int,
    val itemQuantities: List<Int>,
    val orderPaymentStatus: OrderPaymentStatus
)

enum class OrderPaymentStatus {
    IN_COMPLETED,
    COMPLETED
}

enum class OrderStatus {
    INVALID,
    PENDING,
    FULFILLED,
    REJECTED
}

class OrderEvaluation(private val order: Order) {

    fun status(): OrderStatus {
        if (order.orderPaymentStatus != OrderPaymentStatus.COMPLETED) {
            return OrderStatus.INVALID
        }

        if (order.itemQuantities.any { it <= 0 }) {
            return OrderStatus.INVALID
        }

        if (order.itemQuantities.isEmpty()) {
            return OrderStatus.PENDING
        }

        val totalQuantity = order.itemQuantities.sum()

        return if (totalQuantity < TOTAL_MINIMUM_ITEMS_QUANTITY_REQUIRED) {
            OrderStatus.REJECTED
        } else {
            OrderStatus.FULFILLED
        }
    }
}

// get all fulfilled orders
fun fulfilledOrders(orders: List<Order>): List<Order> = orders.filter { OrderEvaluation(it).status() == OrderStatus.FULFILLED }