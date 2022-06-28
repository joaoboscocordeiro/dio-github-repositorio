package src.main.kotlin.one.digitalinnovation.bank.collections.test

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (c, v) -> println("Chave: $c - Valor: $v") }

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    map2.forEach { (c, v) -> println("Chave: $c - Valor: $v") }


}