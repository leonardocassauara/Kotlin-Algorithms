data class Items(val name: String, val price: Float) 


data class Order(val items: Collection<Items>)


fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0f


fun Order.maxPricedItemName(): String = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"


val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()


fun main() {

    val order: Order = Order(listOf(Items("Bread", 25.0f), Items("Wine", 29.0f), Items("Water", 12.0f)))

    println("Max price item name: ${order.maxPricedItemName()}")
    println("Max price item value: R$${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}
