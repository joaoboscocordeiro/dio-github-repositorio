package src.main.kotlin.one.digitalinnovation.bank.collections.test

fun main() {
    val joao = Functionary("João", 2000.0, "CLT")
    val pedro = Functionary("Pedro", 1500.0, "PJ")
    val maria = Functionary("Maria", 4000.0, "CLT")

    val funcionario1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    val funcionario3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }
}