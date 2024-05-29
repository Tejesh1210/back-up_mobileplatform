package assignment.day3new.task10

interface Event {
    val id: String
    val time: Long

    fun schedule(time: Long)
    fun reschedule(newTime: Long)
}