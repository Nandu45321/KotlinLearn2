
fun interface MyFunctionalInterface {
    fun execute()
}

fun main() {

    val square: (Int) -> Int = { it*it }  // we can also specify type for the input like: `(int: Int)`
    val square2: (Int) -> Int = {value -> value * value}
    println(square(5))

    val printMessage = { message: String -> "Test"}

    val sumWithReceiver: Int.() -> Int = { this + 1 }

    val funInterface = MyFunctionalInterface {
        println("Executing")
    }

    funInterface.execute()



}