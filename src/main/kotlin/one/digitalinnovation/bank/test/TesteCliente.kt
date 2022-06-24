package src.main.kotlin.one.digitalinnovation.bank.test

import src.main.kotlin.one.digitalinnovation.bank.Cliente
import src.main.kotlin.one.digitalinnovation.bank.ClienteTipo

fun main() {
    val claudia = Cliente(
        nome = "Claudia Velloso",
        cpf = "123.456.789-97",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(claudia)

    TesteAutenticacao().autentica(claudia)
}