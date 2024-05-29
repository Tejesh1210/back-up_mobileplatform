package Assignmenet.day4newtask1again


fun main() {
    val event1 = ConcreteEvent("1", 1625097600000, "Meeting")
    val event2 = ConcreteEvent("2", 1625184000000, "Conference")

    // Tagging
    event1.addTag("Important")
    event1.addTag("Work")
    event2.addTag("Annual")
    event2.addTag("Important")

    println("Tags for event1: ${event1.getTags()}")
    println("Tags for event2: ${event2.getTags()}")

    event1.removeTag("Work")
    println("Tags for event1 after removal: ${event1.getTags()}")

    // Categorization
    event1.setCategory("Business")
    event2.setCategory("Professional Development")

    println("Category for event1: ${event1.getCategory()}")
    println("Category for event2: ${event2.getCategory()}")
}
