fun lerLista() : MutableList<String> {
    var values 		= readLine() ?: ""
    var arrayValues = values.split(" ")
    return arrayValues.toMutableList()
}


fun inverterLista(lista: MutableList<String>) : MutableList<String> {
    var indexInicioLista = 0
    var indexFinalLista  = lista.size - 1
    
    while (indexInicioLista <= indexFinalLista)
    {
        var aux = lista[indexFinalLista]
        lista[indexFinalLista] = lista[indexInicioLista]
        lista[indexInicioLista] = aux
        indexInicioLista++
        indexFinalLista--
    }
    
    return lista
}


fun main() {
    var lista = lerLista()
    val listaOriginal = lista.toMutableList()
    var listaInvertida = inverterLista(lista)
    println("$listaOriginal\n$listaInvertida")
}