package src.main.kotlin.one.digitalinnovation.bank.collections.test

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    println(">>> SOMA >>>")
    println(salarios.somatoria())

    println(">>> MEDIA >>>")
    println(salarios.media())

}