package Assignmenet.day4.task3

fun main()
{
    val transactions = listOf(
        Transaction(100.00, "Savings", "Checking"),
        Transaction(50.00, "Credit", "Investment"),
        Transaction(-75.00, "Checking", "Bills")
    )

    val totalExpenses = transactions.getTotalExpenses()
    println("Total Expenses: $$totalExpenses") // Output: $75.0

    val totalIncomes = transactions.getTotalIncomes()
    println("Total Incomes: $$totalIncomes") // Output: $150.0

}