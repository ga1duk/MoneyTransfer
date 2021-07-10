fun main() {
    val amount = 10_000_00
    val feeInPercent = 0.0075
    val minimalFee = 3500
    val floatingFee = (amount * feeInPercent).toInt()
    val totalFee = if (floatingFee <= minimalFee) minimalFee else floatingFee
    println(totalFee)
}