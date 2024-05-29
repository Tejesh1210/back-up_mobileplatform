package assignment.day3.task10

fun main(){
    val transaction1 = Transaction(100.00, "Checking", "Savings")
    val transaction2 = Transaction(-50.00, "Savings", "Credit") // Will be corrected to 0.00

    println(transaction1.getAmount) // Output: 100.0
// println(transaction1.amount) // Compilation error: amount is private

    transaction1.displayDetails()
    /* Output:
    Transaction Details:
      Amount: $100.0
      From Account: Checking
      To Account: Savings
      Timestamp: <timestamp in ms>
    */

// Optional: Using TransactionManager
    val manager = TransactionManager()
    manager.addTransaction(transaction1)
    manager.addTransaction(transaction2)

    val allTransactions = manager.getAllTransactions()
    for (transaction in allTransactions) {
        transaction.displayDetails()
    }

}