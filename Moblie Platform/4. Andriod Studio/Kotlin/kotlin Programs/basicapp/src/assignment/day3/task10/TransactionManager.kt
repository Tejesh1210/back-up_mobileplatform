package assignment.day3.task10

class TransactionManager {

    private val transactions: MutableList<Transaction> = mutableListOf()

    fun addTransaction(transaction: Transaction) {
        transactions.add(transaction)
    }

    fun getAllTransactions(): List<Transaction> {
        return transactions.toList() // Return a copy to avoid modification
    }


}
