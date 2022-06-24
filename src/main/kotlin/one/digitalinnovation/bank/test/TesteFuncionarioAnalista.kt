package src.main.kotlin.one.digitalinnovation.bank.test

import src.main.kotlin.one.digitalinnovation.bank.Analista

fun main() {
    val joao = Analista("João Bosco", "123.456.789-98", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}