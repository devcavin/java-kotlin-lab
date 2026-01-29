package kotlinlab.koans

private const val MINIMUM_AMOUNT = 50.00

data class Payment(val amount: Double, val currency: String, val isConfirmed: Boolean)

enum class PaymentStatus { INVALID, ACCEPTED, REJECTED }

class PaymentRecord(private val payment: Payment) {
    fun status(): PaymentStatus {
        if (!payment.isConfirmed) {
            return PaymentStatus.INVALID
        }

        return if (payment.amount <= 0.0) {
            PaymentStatus.INVALID
        } else if (payment.amount < MINIMUM_AMOUNT) {
            PaymentStatus.REJECTED
        } else {
            PaymentStatus.ACCEPTED
        }
    }
}

// list of accepted payments
fun acceptedPayments(payments: List<Payment>): List<Payment> {
    return payments.filter {
        PaymentRecord(it).status() == PaymentStatus.ACCEPTED
    }
}