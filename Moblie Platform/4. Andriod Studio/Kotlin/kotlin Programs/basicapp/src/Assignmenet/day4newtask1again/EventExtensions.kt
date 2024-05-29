package Assignmenet.day4newtask1again

private val eventTags = mutableMapOf<String, MutableSet<String>>()
private val eventCategories = mutableMapOf<String, String>()

fun Event.addTag(tag: String) {
    val tags = eventTags.getOrPut(this.id) { mutableSetOf() }
    tags.add(tag)
    println("Tag '$tag' added to event ${this.id}")
}

fun Event.removeTag(tag: String) {
    eventTags[this.id]?.remove(tag)
    println("Tag '$tag' removed from event ${this.id}")
}

fun Event.getTags(): Set<String> {
    return eventTags[this.id] ?: emptySet()
}

fun Event.setCategory(category: String) {
    eventCategories[this.id] = category
    println("Category '$category' set for event ${this.id}")
}

fun Event.getCategory(): String? {
    return eventCategories[this.id]
}

