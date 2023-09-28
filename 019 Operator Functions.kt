operator fun Int.times(str: String) : String = str.repeat(this)


operator fun String.get(range: IntRange) : String = substring(range)


fun main() {

    println(2 * "Bye")
    val str : String = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}