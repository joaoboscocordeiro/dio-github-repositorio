package src.main.kotlin.one.digitalinnovation.bank

class Pessoa {
    var nome: String = "João Bosco"
    var cpf: String = "123.123.789-89"
}

fun main() {
    val joao = Pessoa()

    println("NOME: ${joao.nome}")
    println("CPF: " + joao.cpf)
}