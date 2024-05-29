package assignment2.day1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter event name:")
    val name = scanner.nextLine()

    println("Enter event date (YYYY-MM-DD):")
    val date = scanner.nextLine()

    println("Enter expected attendee count:")
    val attendeeCount = scanner.nextInt()

    val event = when {
        attendeeCount < 0 -> {
            println("if it is less than 0. Event not created.")
            null
        }
        else -> task3(name, date, attendeeCount)
    }

    if (event != null) {
        println("Event created:")
        println("Name: ${event.name}")
        println("Date: ${event.date}")
        println("Attendee Count: ${event.attendeeCount}")
    }
}
