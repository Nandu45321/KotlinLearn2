fun main() {

    val fruits = arrayOf("Banana", "Apple", "Mango")

    for (item in fruits) {
        println(item)
    }

    for ((index, item) in fruits.withIndex()) {
        if (index == 1) continue // Skipping some iterations
        println("$index - $item")
    }

    var i = 10
    while (i > 0){
        println(i)
        i--
    }

    i = 10
    do {
        println(i)
        i--
    }
    while (i > 0)

}