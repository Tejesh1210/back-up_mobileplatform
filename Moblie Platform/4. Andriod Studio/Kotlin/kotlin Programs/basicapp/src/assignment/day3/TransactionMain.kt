package assignment.day3

fun main() {
    val transactions = listOf(
        Transaction("1", 100.0, "2010-01-01"),
        Transaction("2", 240.0, "2020-02-02"),
        Transaction("3", 100.0, "2021-03-03")
    )

    val expo = CsvExporter(transactions)
    val csvContent = expo.exportToCsv()
    println(csvContent)

    // Uncomment the following line to save the CSV content to a file
    expo.saveToCsvFile("transactions.csv")
}