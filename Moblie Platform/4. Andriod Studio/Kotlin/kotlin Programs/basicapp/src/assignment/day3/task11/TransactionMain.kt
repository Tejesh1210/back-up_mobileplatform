package assignment.day3.task11

fun main()
{
    val transactions = listOf(
        Transaction(100.00, "Checking", "Savings"),
        Transaction(50.00, "Savings", "Credit"),
        Transaction(75.00, "Credit", "Investment")
    )

    val totalAmount = TransactionCollectionUtils.getTotalAmount(transactions)
    println("Total Amount: $$totalAmount") // Output: 225.0

    val savingsToCredit = TransactionCollectionUtils.findTransactionsByProperty(
        transactions, "fromAccount", "Savings"
    )
    for (transaction in savingsToCredit) {
        transaction.displayDetails()
    }

}