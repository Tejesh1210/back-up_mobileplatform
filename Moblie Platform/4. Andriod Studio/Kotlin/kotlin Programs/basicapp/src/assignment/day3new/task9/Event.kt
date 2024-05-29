package assignment.day3new.task9

interface Event {
    val id: String
    var time: Long

    fun schedule(time: Long)
    fun reschedule(newTime: Long)
}