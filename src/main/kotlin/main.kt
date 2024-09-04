fun main() {
    val amount = 5

    println(tax(amount))
}

fun tax(amount: Int): Double {
    return if (amount * COMMISSION < MIN_TAX) {
        MIN_TAX.toDouble()
    } else {
        amount * COMMISSION
    }
}

const val COMMISSION = 0.75
const val MIN_TAX = 35