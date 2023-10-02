class Person (val name: String) {
    val likedPeople: MutableList<Person> = mutableListOf<Person>()
    infix fun likes(other: Person) : Unit { likedPeople.add(other) }
}


infix fun Int.times(str: String) : String = str.repeat(this)


infix fun String.onto(other: String) : Pair<String, String> = Pair(this, other)


fun main() {
    
    println(2 times "Bye ")

    val pair : Pair<String, String> = "Ferrari" to "Katrina" // ("Ferrari", "Katrina")
    println(pair)

    val myPair : Pair<String, String> = "McLaren" onto "Lucas"
    println(myPair)

    val sophia: Person  = Person("Sophia")
    val claudia: Person = Person("Claudia")
    sophia likes claudia
    println(sophia.likedPeople.map { it.name })
    println(claudia.likedPeople.map { it.name })
}
