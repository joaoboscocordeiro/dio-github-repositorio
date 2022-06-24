package src.main.kotlin.one.digitalinnovation.bank.test

import src.main.kotlin.one.digitalinnovation.bank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}