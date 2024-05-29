package Assignmenet.day4.task2

class Transaction(
    private val amount: Double,
    private val fromAccount: String,
    private val toAccount: String,
    private val timestamp: Long = System.currentTimeMillis()
) {

    val getAmount: Double
        get() = if (amount >= 0) amount else 0.0

    val getFromAccount: String
        get() = fromAccount

    val getToAccount: String
        get() = toAccount

    val getTimestamp: Long
        get() = timestamp

    fun displayDetails() {
        println("Transaction Details:")
        println("  Amount: $$getAmount")
        println("  From Account: $getFromAccount")
        println("  To Account: $getToAccount")
        println("  Timestamp: $getTimestamp (ms)")
    }
}
