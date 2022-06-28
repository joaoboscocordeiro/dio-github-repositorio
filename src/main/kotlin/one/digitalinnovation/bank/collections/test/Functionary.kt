package src.main.kotlin.one.digitalinnovation.bank.collections.test

data class Functionary(
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
