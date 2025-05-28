
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun getMathOp(opName: String): (Int, Int) -> Int {
    return when(opName) {
        "add" -> { a, b -> a + b }
        "sub" -> { a, b -> a - b }
        "mul" -> { a, b -> a * b }
        "div" -> { a, b -> a / b }
        else -> { _, _ -> 0}
    }
}

fun main() {

    val result = operateOnNumbers(10, 20, {a, b ->
        a + b
    })  //OR

    val result2 = operateOnNumbers(10, 20) {a, b ->
        a + b
    }

    println(result)


    val op = getMathOp("add")  //This is a function now
    println(op(2, 3))

}