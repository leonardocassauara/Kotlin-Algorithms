fun customPrint(string: String) {
    print(string.uppercase())
    }


fun printNonNull (string: String?) {
    println("Printing \"$string\": ")

    string?.let {
        print("\t")
        customPrint(it)
        println()
    }
}


fun printIfBothNonNull (strOne: String?, strTwo: String?) {
    strOne?.let {
        firstString -> strTwo?.let {
            secondString ->
            customPrint("$firstString : $secondString")
            println()
        }
    }
}


fun main() {
    
    val empty: Boolean = "test".let {        // Executa esse bloco se o objeto for não nulo
        customPrint(it)            
        it.isEmpty()                
    }
    println(" is empty: $empty")

    printNonNull(null)
    printNonNull("My String")
    printIfBothNonNull("First", "Second")
}
