package assignment.day3new.task9

fun main() {
    val schedule = Schedule()

    val event1 = ConcreteEvent("1", 1625097600000)
    val event2 = ConcreteEvent("2", 1625184000000)

    schedule.addEvent(event1)
    schedule.addEvent(event2)

    println("Event 1 time: ${schedule.getEvent("1")?.time}")
    println("Event 2 time: ${schedule.getEvent("2")?.time}")

    schedule.rescheduleEvent("1", 1625270400000)

    println("Event 1 new time: ${schedule.getEvent("1")?.time}")

    schedule.removeEvent("2")
    println("Event 2 exists: ${schedule.getEvent("2") != null}")
}
