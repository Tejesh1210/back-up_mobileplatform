package assignment.day3new.task10

class Schedule : Scheduler {
    private val events = mutableMapOf<String, Event>()

    override fun addEvent(event: Event) {
        events[event.id] = event
        println("Event ${event.id} added to schedule")
    }

    override fun removeEvent(eventId: String) {
        events.remove(eventId)
        println("Event $eventId removed from schedule")
    }

    override fun getEvent(eventId: String): Event? {
        return events[eventId]
    }

    override fun rescheduleEvent(eventId: String, newTime: Long) {
        val event = events[eventId]
        if (event != null) {
            event.reschedule(newTime)
            println("Event $eventId rescheduled to $newTime")
        } else {
            println("Event $eventId not found in schedule")
        }
    }
}