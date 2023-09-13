enum class Color (val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() : Boolean {
        return (this.rgb and 0xFF0000 != 0)
    }
}


enum class State {
    IDLE, RUNNING, FINISHED
}

fun main() {
    
    val state: State = State.RUNNING
    val message: String = when (state) {
        State.IDLE     -> "It's Idle"
        State.RUNNING  -> "It's Running"
        State.FINISHED -> "It's Finished"
    } 

    println(message)
    

    val red: Color = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}
