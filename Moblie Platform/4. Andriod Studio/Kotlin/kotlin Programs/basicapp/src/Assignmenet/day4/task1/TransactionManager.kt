package Assignmenet.day4.task1

class TransactionManager {

    private val transactions: MutableList<Transaction?> = mutableListOf() // Allow null values in the list

    fun addTransaction(transaction: Transaction?) {
        transaction?.let { transactions.add(it) } // Add only if transaction is not null
    }

    fun getTransaction(index: Int): Transaction? {
        return if (index >= 0 && index < transactions.size) transactions[index] else null
    }

    fun getAllTransactions(): List<Transaction> {
        return transactions.filterNotNull()
    }
}
