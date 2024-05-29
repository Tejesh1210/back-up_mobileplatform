package assignment.day3new.task10

class ConcreteEvent(override val id: String, private var _time: Long) : Event {

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
