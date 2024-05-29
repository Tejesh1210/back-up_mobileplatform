package Assignment1.day2

import java.util.Date

// Base class Transaction
open class task4(val amount: Double, val date: Date) {
    override fun toString(): String {
        return "Transaction(amount=$amount, date=$date)"
    }
}

// Derived class Income
class Income(amount: Double, date: Date) : task4(amount, date) {
    override fun toString(): String {
        return "Income(amount=$amount, date=$date)"
    }
}

// Derived class Expense
class Expense(amount: Double, date: Date) :task4(amount, date) {
    override fun toString(): String {
        return "Expense(amount=$amount, date=$date)"
    }
}

fun main() {
    // Creating instances of Income and Expense
    val income = Income(1200.0, Date())
    val expense = Expense(600.0, Date())

    // Printing transactions
    println("Income: $income")
    println("Expense: $expense")
}
