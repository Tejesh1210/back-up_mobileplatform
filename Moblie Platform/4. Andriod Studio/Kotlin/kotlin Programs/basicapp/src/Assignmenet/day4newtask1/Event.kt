package Assignmenet.day4newtask1

interface Event {
    val id: String
    val time: Long
    val type: String

    fun schedule(time: Long)
    fun reschedule(newTime: Long)
}