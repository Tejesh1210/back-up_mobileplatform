package assignment.day3new.task11



fun main() {
    val schedule = Schedule()

    val event1 = ConcreteEvent("1", 1625097600000, "Meeting")
    val event2 = ConcreteEvent("2", 1625184000000, "Conference")
    val event3 = ConcreteEvent("3", 1625184000000, "Meeting")

    schedule.addEvent(event1)
    schedule.addEvent(event2)
    schedule.addEvent(event3)

    println("All events:")
    schedule.getEvent("1")?.let { println("Event 1: id=${it.id}, time=${it.time}, type=${it.type}") }
    schedule.getEvent("2")?.let { println("Event 2: id=${it.id}, time=${it.time}, type=${it.type}") }
    schedule.getEvent("3")?.let { println("Event 3: id=${it.id}, time=${it.time}, type=${it.type}") }

    println("\nEvents on 1625184000000:")
    val eventsByDate = schedule.filterEventsByDate(1625184000000)
    eventsByDate.forEach { println("Event: id=${it.id}, time=${it.time}, type=${it.type}") }

    println("\nEvents of type 'Meeting':")
    val eventsByType = schedule.filterEventsByType("Meeting")
    eventsByType.forEach { println("Event: id=${it.id}, time=${it.time}, type=${it.type}") }
}
