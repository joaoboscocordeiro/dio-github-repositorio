package src.main.kotlin.one.digitalinnovation.bank.collections.test

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value
    }

    fun removed(id: String) = map.remove(id)

    fun findById(id: String) = map[id]

    fun findAll() = map.values
}