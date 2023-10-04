fun <T> T?.nullSafeToString() = this?.toString() ?: "Ausência de Valor"


fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
    println(1.nullSafeToString())
}
