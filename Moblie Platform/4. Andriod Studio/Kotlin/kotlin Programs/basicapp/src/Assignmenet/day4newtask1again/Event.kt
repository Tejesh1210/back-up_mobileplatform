package Assignmenet.day4newtask1again


interface Event {
    val id: String
    val time: Long
    val type: String

    fun schedule(time: Long)
    fun reschedule(newTime: Long)
}

