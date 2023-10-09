fun main() {
    val a: Int = 10
    val b: Int = 0
    
    try {
		val divisao: Int = a / b
    }
    catch (e: ArithmeticException) {
        println("Ocorreu um erro aritmético")
    }
    catch (e: Throwable) {
    	println(e.message)
    }
    finally {
    	println("Esse bloco será executado se houver erro ou não")
    }
}