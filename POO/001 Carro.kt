interface Veiculo {
    fun acelerar()
}


open class Carro(private var modelo: String) : Veiculo {

    var cor: String = ""
    var ano: Int = 0

    override fun acelerar() {
        println("Acelerando!")
    }

    fun ligar() {
        println("Ligando...")
    }

    fun desligar() {
        println("Desligando...")
    }

    fun checarModelo() {
        println("Modelo: ${modelo}")
    }
}


class CarroEsportivo(modelo: String) : Carro(modelo) {
    
    var possuiTracaoNasRodas: Boolean = false

    override fun acelerar() {
        println("Voando!!!!")
    }
    
    fun checarTracao() {
        println(if (possuiTracaoNasRodas) "Possui tração nas rodas (4x4)" else "Não possui tração nas rodas (4x4)")
    }
}


fun main() {

    val ferrari = CarroEsportivo("Ferrari")
    ferrari.apply {
        cor = "Preto"
        ano = 2020
        possuiTracaoNasRodas = true
    }

    val palio = Carro("Palio")
    palio.apply {
        cor = "Cinza"
        ano = 2005
    }

    ferrari.checarModelo()
    ferrari.ligar()
    ferrari.acelerar()
    ferrari.checarTracao()
    ferrari.desligar()
    
    println()

    palio.checarModelo()
    palio.ligar()
    palio.acelerar()
    palio.desligar()
}