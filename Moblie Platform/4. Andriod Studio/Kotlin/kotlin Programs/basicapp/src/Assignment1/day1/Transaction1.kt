package Assignment1.day1

import java.util.Date

class Transaction1(
    val amount: Double,
    val date: Date,
    val category: String
) {
    fun categorizeTransaction(): String {
        return when {
            amount <= 0 -> "Invalid Transaction"
            amount <= 50 -> "Food"
            amount <= 100 -> "Utilities"
            amount <= 200 -> "Entertainment"
            else -> "Other"
        }
    }

    override fun toString(): String {
        return "Transaction(amount=$amount, date=$date, category='$category')"
    }
}

fun main() {
    val t1 = Transaction1(80.0, Date(), "paper")
    println("Transaction 1 Category: ${t1.categorizeTransaction()}")

    val t2 = Transaction1(150.0, Date(), "movies")
    println("Transaction 2 Category: ${t2.categorizeTransaction()}")
}