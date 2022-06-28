package src.main.kotlin.one.digitalinnovation.bank.collections.test

fun main() {
    val joao = Functionary("João", 2000.0, "CLT")
    val pedro = Functionary("Pedro", 1500.0, "PJ")
    val maria = Functionary("Maria", 4000.0, "CLT")

    println(">>>>>>>>>>>>>>> LIST >>>>>>>>>>>>>>>>>>>")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println(">>>>>>>>>>>>>>> SET >>>>>>>>>>>>>>>>>>>")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}