fun main() {

    val user1 = User("Allice", 30)
    println(user1)

    // Uses the first value (Allice) if only one variable is passed, like: val (smth)
    // Can do val (name, _) for doing things
    val (name, age) = user1

    println(name)
    println(age)


}