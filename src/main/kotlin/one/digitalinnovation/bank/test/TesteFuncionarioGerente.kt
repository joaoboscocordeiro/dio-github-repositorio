package src.main.kotlin.one.digitalinnovation.bank.test

import src.main.kotlin.one.digitalinnovation.bank.Analista
import src.main.kotlin.one.digitalinnovation.bank.Funcionario
import src.main.kotlin.one.digitalinnovation.bank.Gerente

fun main() {
    val roberta = Gerente("Roberta", "123.456.789-98", 5000.0)
    ImprimeRelatorioFuncionario.imprime(roberta)
}