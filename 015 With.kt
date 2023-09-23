class Configuration(val host: String, val port: Int)


fun main() {
    val configuration: Configuration = Configuration(host = "127.0.0.1", port = 9000)

    with (configuration) {
        println("${host}:${port}")      // Usualmente, $configuration.host : $configuration.port
    }
}
