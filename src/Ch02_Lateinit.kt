fun main() {

    val example = LateinitExample()
    example.initializeName()
    example.printName()
}

class LateinitExample {
    lateinit var name: String

    fun initializeName() {
        name = "Kotlin"
    }

    fun printName() {
        if (::name.isInitialized) {
            println(name)
        }
        else{
            println(name)
        }
    }
}