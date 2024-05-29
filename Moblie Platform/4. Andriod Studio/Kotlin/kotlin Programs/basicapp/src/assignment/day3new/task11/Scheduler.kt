package assignment.day3new.task11

interface Scheduler {
    fun addEvent(event: Event)
    fun removeEvent(eventId: String)
    fun getEvent(eventId: String): Event?
    fun rescheduleEvent(eventId: String, newTime: Long)
    fun filterEventsByDate(date: Long): List<Event>
    fun filterEventsByType(type: String): List<Event>
}