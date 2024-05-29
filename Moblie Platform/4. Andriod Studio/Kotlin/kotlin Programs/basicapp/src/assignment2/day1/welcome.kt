package assignment2.day1

fun main() {
    val name = "Tejsh"
    val currentTime = 18

    val greet = when (currentTime) {
        in 6..11 -> "Good morning, $name!"
        in 12..17 -> "Good afternoon, $name!"
        in 18..21 -> "Good evening, $name!"
        else -> "Hello, $name!"
    }

    println(greet)
}
