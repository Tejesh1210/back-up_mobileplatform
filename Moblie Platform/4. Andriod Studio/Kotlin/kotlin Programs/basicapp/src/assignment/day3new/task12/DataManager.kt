package assignment.day3new.task12

class DataManager<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
        println("Item added: $item")
    }

    fun removeItem(item: T) {
        items.remove(item)
        println("Item removed: $item")
    }

    fun getItems(): List<T> {
        return items.toList()
    }

    fun findItem(predicate: (T) -> Boolean): T? {
        return items.find(predicate)
    }
}