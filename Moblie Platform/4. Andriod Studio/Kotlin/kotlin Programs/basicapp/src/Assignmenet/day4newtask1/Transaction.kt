package Assignmenet.day4newtask1


fun main() {
    val schedule = Schedule()

    val event1 = ConcreteEvent("1", 1625097600000, "Meeting")
    val event2 = ConcreteEvent("2", 1625184000000, "Conference")

    schedule.addEvent(event1)
    schedule.addEvent(event2)

    println("All Events:")
    schedule.getEvent("1")?.let { println("Event 1: id=${it.id}, time=${it.time}, type=${it.type}") }
    schedule.getEvent("2")?.let { println("Event 2: id=${it.id}, time=${it.time}, type=${it.type}") }

    println("\nRetrieving non-existing event:")
    val nonExistentEvent = schedule.getEvent("3")
    if (nonExistentEvent == null) {
        println("Event 3 does not exist.")
    }

    println("\nRescheduling an existing event:")
    schedule.rescheduleEvent("1", 1625270400000)

    println("\nTrying to reschedule a non-existing event:")
    schedule.rescheduleEvent("3", 1625356800000)
}

