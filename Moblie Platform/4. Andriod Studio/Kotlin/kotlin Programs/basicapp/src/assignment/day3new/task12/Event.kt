package assignment.day3new.task12

interface Event {
    val id: String
    val time: Long
    val type: String

    fun schedule(time: Long)
    fun reschedule(newTime: Long)
}







