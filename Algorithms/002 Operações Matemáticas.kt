fun somar (a: Int, b: Int) : Int {
    return a + b
}

fun multiplicar (a: Int, b: Int) : Int {
    return a * b
}

fun dividir (a: Float, b: Float) : Float {
    return a / b
}

fun subtrair (a: Int, b: Int) : Int {
    return a - b
}

fun somarIndefinidamente (vararg a: Int) : Int {
    var acumulador = 0
    for (element in a) acumulador = acumulador + element
    return acumulador
}

fun main () {
    val a: Int = somar(3, 4)
    val b: Int = multiplicar(3, 4)
    val c: Float = dividir(3.0f, 4.0f)
    val d: Int = subtrair(3, 4)
    val e: Int = somarIndefinidamente(3, 4, 5, 6, 7, 8, 9)
    println("$a $b $c $d $e")
}