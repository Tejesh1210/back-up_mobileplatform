package Assignmenet.day4.task2

class InsufficientFundsException(fromAccount: String) : TransactionProcessingException(
    "Insufficient funds in account: $fromAccount"
)
