package assignment.day3.task10

class Transaction(
    private val amount: Double,
    private val fromAccount: String,
    private val toAccount: String,
    private val timestamp: Long = System.currentTimeMillis() // Optional default value
) {

    // Getter for amount with basic validation
    val getAmount: Double
        get() = if (amount >= 0) amount else 0.0 // Enforce non-negative amount

    // Getter for fromAccount
    val getFromAccount: String
        get() = fromAccount

    // Getter for toAccount
    val getToAccount: String
        get() = toAccount

    // Getter for timestamp (optional)
    val getTimestamp: Long
        get() = timestamp

    // Custom method for displaying transaction details (optional)
    fun displayDetails() {
        println("Transaction Details:")
        println("  Amount: $$getAmount")
        println("  From Account: $getFromAccount")
        println("  To Account: $getToAccount")
        println("  Timestamp: $getTimestamp (ms)")
    }
}
