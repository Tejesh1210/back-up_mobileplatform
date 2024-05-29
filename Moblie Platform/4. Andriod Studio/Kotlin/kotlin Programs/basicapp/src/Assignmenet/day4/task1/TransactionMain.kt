package Assignmenet.day4.task1

fun main()
{
    val manager = TransactionManager()

    manager.addTransaction(Transaction(100.00, "Checking", "Savings")) // Added
    manager.addTransaction(null) // Ignored

    val firstTransaction = manager.getTransaction(0) // May be null
    if (firstTransaction != null) {
        firstTransaction.displayDetails()
    } else {
        println("No transaction found at index 0")
    }

    val allTransactions = manager.getAllTransactions() // Contains only non-null elements
    for (transaction in allTransactions) {
        transaction.displayDetails()
    }

}