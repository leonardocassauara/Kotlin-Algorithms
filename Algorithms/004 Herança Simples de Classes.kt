open class Dog {               // Classe Alvo de Herança - key word Open necessária
    open fun sayHello() {
        println("wow wow!")
    }
}


class Yorkshire: Dog() {      // Notação de Herança
    override fun sayHello() {  // Override - Sobreescrever função
        println("wif wif!")
    }
}


fun main(){
    val catchorro: Dog = Yorkshire()
    catchorro.sayHello()
}
