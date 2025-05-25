fun String.greet(): String {
    return "Hello $this"
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun main() {

    println("Kotlin".greet())   // Hello Kotlin

    println(3.isEven())

}