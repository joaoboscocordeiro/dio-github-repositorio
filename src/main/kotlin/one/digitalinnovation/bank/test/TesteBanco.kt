package src.main.kotlin.one.digitalinnovation.bank.test

import src.main.kotlin.one.digitalinnovation.bank.Banco

fun main() {
    val digiOneBank = Banco("Santander", 12)

    println("Banco: ${digiOneBank.nome}")
    println("Nº: ${digiOneBank.numero}")

    println("Banco: ${digiOneBank.info()}")
}