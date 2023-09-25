data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}


fun main() {
    
    val jake: Person = Person()
    val stringDescription: String  = jake.apply {
        name  = "Jake"
        age   = 30
        about = "Android Developer"
    }.toString()

    println(stringDescription)
    println(jake.name)
}
