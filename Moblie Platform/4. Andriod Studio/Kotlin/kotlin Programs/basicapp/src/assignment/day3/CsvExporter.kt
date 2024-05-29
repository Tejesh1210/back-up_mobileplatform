package assignment.day3

import java.io.File

class CsvExporter(private val transactions: List<Transaction>) : Exportable {
    override fun exportToCsv(): String {
        val csvContent = StringBuilder()
        csvContent.append("ID,Amount,Date\n")

        for (transaction in transactions) {
            csvContent.append("${transaction.id},${transaction.amount},${transaction.date}\n")
        }

        return csvContent.toString()
    }

    fun saveToCsvFile(filePath: String) {
        val csvContent = exportToCsv()
        File(filePath).writeText(csvContent)
    }
}