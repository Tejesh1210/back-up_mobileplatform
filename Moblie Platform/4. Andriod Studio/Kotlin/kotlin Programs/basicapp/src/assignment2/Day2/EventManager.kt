package assignment2.Day2

class EventManager {

    private val events: MutableMap<String, MutableList<Event>> = mutableMapOf()

    fun addEvent(eventName: String, event: Event) {
        if (!events.containsKey(eventName)) {
            events[eventName] = mutableListOf()
        }
        events[eventName]?.add(event)
    }

    fun removeEvent(eventName: String, event: Event) {
        if (events.containsKey(eventName)) {
            events[eventName]?.remove(event)
        }
    }

    fun removeEventsByEventName(eventName: String) {
        events.remove(eventName)
    }

    fun getEvents(eventName: String): List<Event> {
        return events[eventName] ?: emptyList()
    }

    fun getAllEvents(): Map<String, List<Event>> {
        return events
    }
}

data class Event(val name: String, val time: Long) {
    override fun toString(): String {
        return "Event(name='$name', time=$time)"
    }
}

// Example usage
fun main() {
    val eventManager = EventManager()

    val event1 = Event("Eco-Conscious expo", 1652637200000) // Thursday, May 16, 2024 8:30 PM IST
    val event2 = Event("Birthday Party", 1652723600000) // Saturday, May 18, 2024 8:30 PM IST
    val event3 = Event("Fitness frenzy", 1652637200000) // Thursday, May 16, 2024 8:30 PM IST (duplicate)

    eventManager.addEvent("Work Events", event1)
    eventManager.addEvent("Food fiesta", event2)
    eventManager.addEvent("Dare devcon", event3) // Duplicate event

    eventManager.removeEvent("Work Events", event3) // Remove duplicate event

    val workEvents = eventManager.getEvents("Work Events")
    val allEvents = eventManager.getAllEvents()

    println("Work Events: $workEvents")
    println("All Events: $allEvents")
}
