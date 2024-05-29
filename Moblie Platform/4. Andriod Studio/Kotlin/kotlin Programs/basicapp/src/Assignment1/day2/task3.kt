package Assignment1.day2

import java.util.Date

data class task3(val amount: Double, val date: Date, val category: String)

class TransactionList {
    private val transactions = mutableListOf<Transaction>()

    // Function to add a transaction to the list
    fun addTransaction(amount: Double, date: Date, category: String) {
        val transaction = Transaction(amount, date, category)
        transactions.add(transaction)
    }

    // Function to filter transactions based on a predicate
    fun filterTransactions(predicate: (Transaction) -> Boolean): List<Transaction> {
        return transactions.filter(predicate)
    }

    // Function to sort transactions by date
    fun sortByDate(): List<Transaction> {
        return transactions.sortedBy { it.date }
    }

    // Function to sort transactions by amount
    fun sortByAmount(): List<Transaction> {
        return transactions.sortedBy { it.amount }
    }

    // Function to display all transactions in the list
    fun displayTransactions(transactions: List<Transaction>) {
        if (transactions.isEmpty()) {
            println("No transactions available.")
        } else {
            println("Transaction List:")
            transactions.forEachIndexed { index, transaction ->
                println("$index: $transaction")
            }
        }
    }
}

fun main() {
    val transactionList = TransactionList()

    // Adding sample transactions
    transactionList.addTransaction(100.0, Date(2023, 1, 15), "Food")
    transactionList.addTransaction(50.0, Date(2023, 2, 10), "Utilities")
    transactionList.addTransaction(80.0, Date(2023, 3, 20), "Entertainment")
    transactionList.addTransaction(120.0, Date(2023, 4, 5), "Health")

    // Filter transactions by amount greater than 80
    val filteredByAmount = transactionList.filterTransactions { it.amount > 80 }
    println("Transactions filtered by amount greater than 80:")
    transactionList.displayTransactions(filteredByAmount)

    // Sort transactions by date
    val sortedByDate = transactionList.sortByDate()
    println("Transactions sorted by date:")
    transactionList.displayTransactions(sortedByDate)

    // Sort transactions by amount
    val sortedByAmount = transactionList.sortByAmount()
    println("Transactions sorted by amount:")
    transactionList.displayTransactions(sortedByAmount)
}

