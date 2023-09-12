data class User (val name: String, val id: Int) {
    override fun equals (other: Any?) = other is User && other.id == this.id
}


fun main() {
    val user: User = User("Alex", 1)
    println(user)

    val secondUser: User = User("Alex", 1)
    val thirdUser: User = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser : ${user == thirdUser}")

    // hashCode
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy
    println(user.copy())
    println(user === user.copy())
    println(user == user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))

    // components
    println("name = ${user.component1()}")
    println("id   = ${user.component2()}")
}
