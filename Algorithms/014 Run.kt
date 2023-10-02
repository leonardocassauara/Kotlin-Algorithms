fun getNullableLength(ns: String?) {
    println("for \"$ns\":")
    ns?.run {
        println("\t is empty? " + isEmpty())     // Usualmente, x.isEmpty()
        println("\t length = ${length}")         // Usualmente, x.length
    }
}


fun main() {
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}
