package assignment.day3new.task12

fun main() {
    // Manage Attendees
    val attendeeManager = DataManager<Attendee>()
    val attendee1 = Attendee("1", "Alice")
    val attendee2 = Attendee("2", "Bob")

    attendeeManager.addItem(attendee1)
    attendeeManager.addItem(attendee2)

    println("All Attendees:")
    attendeeManager.getItems().forEach { println(it) }

    attendeeManager.removeItem(attendee1)
    println("Attendees after removal:")
    attendeeManager.getItems().forEach { println(it) }

    // Manage Events
    val eventManager = DataManager<Event>()
    val event1 = ConcreteEvent("1", 1625097600000, "Meeting")
    val event2 = ConcreteEvent("2", 1625184000000, "Conference")

    eventManager.addItem(event1)
    eventManager.addItem(event2)

    println("All Events:")
    eventManager.getItems().forEach { println(it) }

    eventManager.removeItem(event1)
    println("Events after removal:")
    eventManager.getItems().forEach { println(it) }

    val foundEvent = eventManager.findItem { it.id == "2" }
    println("Found Event: $foundEvent")
}