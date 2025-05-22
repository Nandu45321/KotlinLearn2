import kotlin.reflect.typeOf

fun main() {

    val names = arrayOf("Kotlin", "Python", "C")
    val intArray = intArrayOf(1, 2, 3, 4)

    val zeroes = Array(5) {0.1F}
    //   zeroes[2] = 2
    println(zeroes.contentToString())
    println(zeroes[0]::class)

    val intArray1 = IntArray(5) {1}

    println(names.first())
    println(names.last())
    println(names.size)
    println(names.indexOf("c".uppercase()))

    val copyNames = names.copyOf()
    println(copyNames.contains("Python"))
    println(intArray1.sum())

}