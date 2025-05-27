class Repository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun delete(item: T){
        items.remove(item)
    }

    fun getAll(): List<T> = items.toList()
}

data class SomeProduct(val id: Int, val name: String, val price: Double)


fun <T> getAllItems(repo: Repository<T>) {      // If we don't know the type, just do <*>
    return repo.getAll().forEach { println(it) } // |-> called star projection
}

fun <T: Comparable<T>> compare(repo: Repository<T>): List<T> {
    return repo.getAll()
}


fun main() {

    val product1 = SomeProduct(
        1, "Laptop", 200.0
    )

    val product2 = SomeProduct(
        2, "Laptop", 200.0
    )

    val productRepo = Repository<SomeProduct>()

    productRepo.add(product1)
    productRepo.add(product2)

    productRepo.getAll().forEach {
        println(it)
    }

    getAllItems(productRepo)

    val user1 = User("Name1", 1)

    val user2 = User("Name2", 2)

    val userRepo = Repository<User>()

    userRepo.add(user1)
    userRepo.add(user2)

    userRepo.getAll().forEach {
        println(it)
    }


}