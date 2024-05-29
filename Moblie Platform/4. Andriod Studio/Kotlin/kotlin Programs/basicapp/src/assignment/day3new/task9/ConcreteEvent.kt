package assignment.day3new.task9

class ConcreteEvent(override val id: String, override var time: Long) : Event {
    override fun schedule(time: Long) {
        this.time = time
        println("Event $id scheduled at $time")
    }

    override fun reschedule(newTime: Long) {
        this.time = newTime
        println("Event $id rescheduled to $newTime")
    }
}