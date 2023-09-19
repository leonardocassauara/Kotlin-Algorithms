class Bigben {
    companion object Bongers {                  // Nome é opcional
        fun getBongs(nTimes: Int) : Unit {
            for (i in 1 .. nTimes) {
                println("BONG")
            }
        }
    }
}


fun main() {
    Bigben.getBongs(12)                         // Acesso a função de um objeto através da classe
}
