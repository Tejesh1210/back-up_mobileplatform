package Assignmenet.day4newtask2

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date

class Schedule : Scheduler {
    private val events = mutableMapOf<String, Event>()

    override fun addEvent(event: Event) {
        events[event.id] = event
        println("Event ${event.id} added to schedule")
    }

    override fun removeEvent(eventId: String) {
        if (events.remove(eventId) != null) {
            println("Event $eventId removed from schedule")
        } else {
            println("Event $eventId not found in schedule")
        }
    }

    override fun getEvent(eventId: String): Event? {
        return events[eventId] ?: run {
            println("Event $eventId not found in schedule")
            null
        }
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

    override fun filterEventsByDate(date: Long): List<Event> {
        return events.values.filter { it.time == date }
    }

    override fun filterEventsByType(type: String): List<Event> {
        return events.values.filter { it.type == type }
    }

    fun parseDate(dateString: String): Long? {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return try {
            val date: Date = dateFormat.parse(dateString)
            date.time
        } catch (e: ParseException) {
            println("Error parsing date: $dateString")
            null
        }
    }
}
