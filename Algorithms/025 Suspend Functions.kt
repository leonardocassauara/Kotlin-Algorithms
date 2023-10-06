import kotlinx.coroutines.*


suspend fun doWorld() = coroutineScope {
    launch {
        delay(1000L)
        println("World!")
    }
    print("Hello")
}


fun main() = runBlocking {
    doWorld()
}
