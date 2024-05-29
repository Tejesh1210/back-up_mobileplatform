package Assignmenet.day4.task2

class InvalidTransactionAmountException(amount: Double) : TransactionProcessingException(
    "Invalid transaction amount: $$amount. Transaction amount must be non-negative."
)
