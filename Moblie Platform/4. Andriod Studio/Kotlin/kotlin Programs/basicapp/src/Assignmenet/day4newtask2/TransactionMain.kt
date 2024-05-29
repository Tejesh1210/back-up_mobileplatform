package Assignmenet.day4newtask2


fun main() {
    val schedule = Schedule()

    val time1 = schedule.parseDate("2023-07-01 12:00:00")
    val time2 = schedule.parseDate("2023-07-02 15:00:00")
    val invalidTime = schedule.parseDate("invalid-date")

    if (time1 != null) {
        val event1 = ConcreteEvent("1", time1, "Meeting")
        schedule.addEvent(event1)
    }

    if (time2 != null) {
        val event2 = ConcreteEvent("2", time2, "Conference")
        schedule.addEvent(event2)
    }

    println("All Events:")
    schedule.getEvent("1")?.let { println("Event 1: id=${it.id}, time=${it.time}, type=${it.type}") }
    schedule.getEvent("2")?.let { println("Event 2: id=${it.id}, time=${it.time}, type=${it.type}") }

    println("\nAttempting to parse an invalid date:")
    if (invalidTime == null) {
        println("Invalid date could not be parsed.")
    }

    println("\nRescheduling an existing event:")
    if (time1 != null) {
        schedule.rescheduleEvent("1", time1 + 86400000) // Add one day
    }

    println("\nTrying to reschedule a non-existing event:")
    schedule.rescheduleEvent("3", 1625356800000)
}
