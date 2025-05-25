
data class User(val name: String, val age: Int) {

    override fun toString(): String {
        return "Name: $name, Age: $age"   // uses this when println(user1/2) is called
    }
}

fun main() {

    val user1 = User("Allice", 30)
    val user2 = User("Allice", 30)

    println(user1 == user2)  // true
    println(user1)

    val user3 = user1.copy()  //Will copy. These are the same data wise, but the memory allocated is different

    println("Is data the same? : ${ user1 == user3 }")
    println("Is reference the same? : ${ user1 === user3 }") // Checks for reference (is) (mem allocation)

    println("1st component = ${user3.component1()}")
    println("2nd component = ${user3.component2()}")

}