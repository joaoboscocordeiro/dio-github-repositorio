package src.main.kotlin.one.digitalinnovation.bank.collections.test

fun main() {
    val joao = Functionary("João", 2000.0, "CLT")
    val pedro = Functionary("Pedro", 1500.0, "PJ")
    val maria = Functionary("Maria", 4000.0, "CLT")

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