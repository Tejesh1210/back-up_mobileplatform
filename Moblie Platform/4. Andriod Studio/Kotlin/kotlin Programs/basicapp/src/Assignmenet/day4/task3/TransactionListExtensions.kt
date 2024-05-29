package Assignmenet.day4.task3

import kotlin.math.absoluteValue


fun List<Transaction>.getTotalExpenses(): Double {
    return this.filter { it.getAmount < 0.0 }.sumOf { it.getAmount.absoluteValue }
}

fun List<Transaction>.getTotalIncomes(): Double {
    return this.filter { it.getAmount >= 0.0 }.sumOf { it.getAmount }
}
