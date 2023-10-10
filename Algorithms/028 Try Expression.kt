fun main() {
    val a: Int = 10
    val b: Int = 0
    
    val divisao: Int = try { a / b } catch (e: ArithmeticException) { 0 }
    println(divisao)
}