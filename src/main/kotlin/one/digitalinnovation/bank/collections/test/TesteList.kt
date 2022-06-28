package src.main.kotlin.one.digitalinnovation.bank.collections.test

import src.main.kotlin.one.digitalinnovation.bank.Funcionario

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println(funcionarios.find { it.nome == "Maria" })

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String = """
        >>>>>>>>>>>>>>>>>>>>>
        Nome: $nome
        Salario: $salario
    """.trimIndent()
}