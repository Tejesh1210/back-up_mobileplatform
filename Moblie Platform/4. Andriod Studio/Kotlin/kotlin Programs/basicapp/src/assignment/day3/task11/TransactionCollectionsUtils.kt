package assignment.day3.task11

object TransactionCollectionUtils {

    // Generic function to get the total amount from a collection of transactions
    fun <T : Collection<Transaction>> getTotalAmount(transactions: T): Double {
        return transactions.sumOf { it.getAmount }
    }

    // Generic function to find transactions by a specific property (e.g., fromAccount)
    fun <T : Collection<Transaction>> findTransactionsByProperty(
        transactions: T,
        propertyName: String,
        propertyValue: Any
    ): List<Transaction> {
        val filteredTransactions = transactions.filter { transaction ->
            when (propertyName) {
                "amount" -> transaction.getAmount == propertyValue as Double
                "fromAccount" -> transaction.getFromAccount == propertyValue as String
                "toAccount" -> transaction.getToAccount == propertyValue as String
                else -> throw IllegalArgumentException("Invalid property name: $propertyName")
            }
        }
        return filteredTransactions.toList() // Return a copy to avoid modification
    }
}
