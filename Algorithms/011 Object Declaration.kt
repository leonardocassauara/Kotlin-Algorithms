object DoAuth {
    fun takeParams (username: String, password: String) : Unit {
        println("input Auth paramets = $username:$password")
    }
}


fun main() {
    DoAuth.takeParams("foo", "qwerty")
}
