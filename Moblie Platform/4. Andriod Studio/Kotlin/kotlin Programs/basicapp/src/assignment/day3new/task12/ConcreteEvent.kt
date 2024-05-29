package assignment.day3new.task12

class ConcreteEvent(
    override val id: String,
    private var _time: Long,
    override val type: String
) : Event {

    override val time: Long
        get() = _time

    override fun schedule(time: Long) {
        this._time = time
        println("Event $id scheduled at $time")
    }

    override fun reschedule(newTime: Long) {
        this._time = newTime
        println("Event $id rescheduled to $newTime")
    }
}