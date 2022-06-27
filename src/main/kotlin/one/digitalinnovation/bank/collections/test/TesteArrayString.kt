package src.main.kotlin.one.digitalinnovation.bank.collections.test

fun main() {

    val nomes = Array(3) {""}
    nomes[0] = "Zazá"
    nomes[1] = "Maria"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("======================================================")
    nomes.sort()
    nomes.forEach { println(it) }

    println("======================================================")
    val nome2 = arrayOf("Maria", "Zazá", "Pedro")
    nome2.sort()
    nome2.forEach { println(it) }

}