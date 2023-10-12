data class Person(val name: String?)


fun fail(message: String) : Nothing {
    throw IllegalArgumentException(message)
}


fun main() {
    val person: Person = Person("Ricardo")
    val s = person.name ?: fail("Name Required")
    println(s)

    val person2: Person = Person(null)
    val d = person2.name ?: fail("Name Required")
    println(d)
}
