package Assignmenet.day4.task2
fun main() {
    fun checkBalance(accountNumber: String): Double {
        // Simulate accessing a database or external system to get balance
        val balances = mapOf(
            "Checking" to 500.00,
            "Savings" to 200.00,
            "Credit" to 1000.00
        )
        return balances[accountNumber] ?: 0.0 // Return 0.0 if account not found
    }

    fun processTransaction(fromAccount: String, toAccount: String, amount: Double) {
        val availableBalance = checkBalance(fromAccount) // Hypothetical balance check function
        if (availableBalance < amount) {
            throw InsufficientFundsException(fromAccount)
        } else if (amount < 0) {
            throw InvalidTransactionAmountException(amount)
        }
        // Perform actual transaction logic here
        println("Transaction successful!")
    }

    try {
        processTransaction("Checking", "Savings", 100.00)
    } catch (e: TransactionProcessingException) {
        println("Transaction failed: ${e.message}")
    } catch (e: Exception) {
        println("Unexpected error: ${e.message}") // Handle other unforeseen exceptions
    }
}