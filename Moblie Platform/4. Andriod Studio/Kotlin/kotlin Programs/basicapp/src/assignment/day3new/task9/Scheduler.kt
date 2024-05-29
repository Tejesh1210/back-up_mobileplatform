package assignment.day3new.task9

interface Scheduler {
    fun addEvent(event: Event)
    fun removeEvent(eventId: String)
    fun getEvent(eventId: String): Event?
    fun rescheduleEvent(eventId: String, newTime: Long)
}