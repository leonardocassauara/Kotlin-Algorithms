fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int) : Int {
    return operation(x, y) // Lambda
}


fun sum(x: Int, y: Int) : Int = x + y


fun main() {
    val sumResult: Int = calculate(5, 4, ::sum) // Lambda
    val mulResult: Int = calculate(4, 5) { a, b -> a * b}   // Lambda
    println("sumResult: $sumResult \nmulResult: $mulResult")
}
