package src.main.kotlin.one.digitalinnovation.bank.collections.test

fun main() {
    val joao = Functionary("João", 2000.0, "CLT")
    val pedro = Functionary("Pedro", 1500.0, "PJ")
    val maria = Functionary("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Functionary>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
}