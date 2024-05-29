package Assignment1.day2

import java.util.Date

data class Transaction(val amount: Double, val date: Date, val category: String)

class User(val username: String, val password: String) {
    private val transactions = mutableListOf<Transaction>()

    // Function to login user
    fun login(username: String, password: String): Boolean {
        return this.username == username && this.password == password
    }

    // Function to add a transaction
    fun addTransaction(amount: Double, date: Date, category: String) {
        val transaction = Transaction(amount, date, category)
        transactions.add(transaction)
    }

    // Function to display summary of expenses
    fun displayExpenseSummary() {
        println("Expense Summary for $username:")
        if (transactions.isEmpty()) {
            println("No transactions available.")
        } else {
            val totalExpense = transactions.sumByDouble { it.amount }
            println("Total Expenses: $totalExpense")

            val categoryWiseExpenses = transactions.groupBy { it.category }
                .mapValues { (_, transactions) -> transactions.sumByDouble { it.amount } }

            categoryWiseExpenses.forEach { (category, amount) ->
                println("$category: $amount")
            }
        }
    }
}

fun main() {
    val user = User("Tejesh", "123")

    // Logging in
    val loggedIn = user.login("Tejesh", "123")
    if (loggedIn) {
        println("Login successful.")
    } else {
        println("Login failed.")
        return
    }

    // Adding sample transactions
    user.addTransaction(100.0, Date(), "Food")
    user.addTransaction(50.0, Date(), "Utilities")
    user.addTransaction(80.0, Date(), "Entertainment")
    user.addTransaction(30.0, Date(), "Food")

    // Displaying expense summary
    user.displayExpenseSummary()
}
