fun main() {
    val amount = 5

    fun tax(amount: Int): Double {
        return if (amount * COMMISSION < MIN_TAX) {
            MIN_TAX.toDouble()
        } else {
            amount * COMMISSION
        }
    }
    println(tax(amount))
}
const val COMMISSION = 0.75
const val MIN_TAX = 35