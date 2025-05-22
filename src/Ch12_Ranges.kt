fun main() {

    val range1 = 1 .. 10 // type = intRange

    for (i in range1) println(i)

    for (i in 5 .. 9 step 2) println(i)

    //reverse range
    for (i in 15 downTo 1 step 3) println(i)

    // until
    for (i in 1 until 10) println(i)

    //range on char
    for (ch in 'a'..'n') println(ch)



}