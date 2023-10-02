sealed class Mammal (val name: String)


class Cat (val catName: String) : Mammal(catName)
class Human (val humanName: String, val job: String) : Mammal(humanName)


fun greetMammal(mammal: Mammal) : String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as ${mammal.job}"
        is Cat   -> return "Hello ${mammal.name}"
    }
}


fun main() {
    val cat: Mammal = Cat("Snowy")
    val human: Mammal = Human("John", "Unemployed")

    println(greetMammal(human))
    println(greetMammal(cat))
}
