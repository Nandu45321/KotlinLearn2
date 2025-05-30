// Data classes storing 2 and 3 values

fun main() {

    val pair = Pair(1, "one")
    val pair2 = 2 to "two" // You can do this also
    println(pair.first)
    println(pair.second)

    val triple = Triple(1, "one", 1.0)
    println(triple.first)
    println(triple.second)
    println(triple.third)


}