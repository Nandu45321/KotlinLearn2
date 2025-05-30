// List
// Set
// Map


fun main() {

    val list = listOf<Int>(1, 2, 3) // Immutable
    val mlist = mutableListOf<Int>(1, 2, 3)  // Mutable
    mlist.add(4)
    println(list)
    println(mlist)

    val set = setOf<Int>(1, 2, 3, 1) // Immutable
    val mset = mutableSetOf<Int>(1, 2, 3, 1) // Mutable
    mset.add(5)
    println(set)
    println(mset)

    val map = mapOf<Int, String>(
        1 to "one",
        2 to "two",
        Pair(3, "three"),
    ) // Immutable
    val mmap = mutableMapOf<Int, String>() // Mutable
    mmap.put(5, "five")
    println(map)
    println(mmap)


}