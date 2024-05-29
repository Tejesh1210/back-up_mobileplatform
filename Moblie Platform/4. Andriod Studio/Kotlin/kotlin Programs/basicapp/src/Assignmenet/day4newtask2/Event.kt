package Assignmenet.day4newtask2

interface Event {
    val id: String
    val time: Long
    val type: String

    fun schedule(time: Long)
    fun reschedule(newTime: Long)
}



