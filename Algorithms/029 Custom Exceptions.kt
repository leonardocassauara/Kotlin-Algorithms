class IllegalVoterException(message: String) : Throwable(message)


@Throws (IllegalVoterException::class) // Documentação

fun vote(name: String, age: Int) : Unit {
    if (age < 16) {
        throw IllegalVoterException("Apenas pessoas com mais de 16 anos podem votar")
    }
    else {
        println("Voto de $name realizado com sucesso")
    }
}


fun main() {
    
    var quantidadeDeVotos: Int = 0
    quantidadeDeVotos += try { vote("Jao", 20); 1 } catch (e: IllegalVoterException) { 0 }
    quantidadeDeVotos += try { vote("Maria", 10); 1 } catch (e: IllegalVoterException) { 0 }
    quantidadeDeVotos += try { vote("Aldebaran", 50); 1 } catch (e: IllegalVoterException) { 0 }
    println(quantidadeDeVotos)   
}
