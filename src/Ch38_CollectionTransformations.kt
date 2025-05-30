fun main() {

    val list = listOf(1, 2, 3, 4)

    val firstElement = list.first()  // Use `.firstOrNull()` for security
    val lastElement = list.last()  // Use `.lastOrNull()` for security
    println(firstElement)
    println(lastElement)

    val filteredList1 = list.filter { it % 2 == 0 }  // Basically loops
    val filteredList2 = list.filter { item -> item % 2 == 0 }  // Same
    println(filteredList1)

    val List2 = list.map { item -> item * 2 }
    println(List2)

    val groupBy = list.groupBy { item -> item % 2 == 0 }
    println(groupBy)

    val distinctList = list.distinct() // Removes duplicates
    val sortedList = list.sorted()  // use `sortedDescending()` for reverse sort
    val revsortedList = list.reversed()

    val assoc = list.associate {
        it to it * 2
    }
    println(assoc)

    val assocBy = list.associateBy {
        it % 2 == 0
    }
    println(assocBy)

    val assocWith = list.associateWith {
        it % 2 == 0
    }
    println(assocWith)


    val part = list.partition {
        it % 2 == 0
    }
    println(part)

    val str = list.joinToString(separator = " ", prefix = "---({[", postfix = "]})---")
    println(str)
    val str2 = list.joinToString(separator = " ", prefix = "({[", postfix = "]})"){
        ( it * 2 ).toString()
    }
    println(str2)



}