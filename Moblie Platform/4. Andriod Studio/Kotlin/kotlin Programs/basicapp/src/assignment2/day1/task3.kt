package assignment2.day1


data class task3(val name: String, val date: String, val attendeeCount: Int)

fun main() {

    val event = task3("Kotlin Workshop", "2024-05-16", 15)


    println("Event Name: ${event.name}")
    println("Date: ${event.date}")
    println("Attendee Count: ${event.attendeeCount}")
}
