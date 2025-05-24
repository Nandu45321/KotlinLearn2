fun main() {

}

fun add(a: Int, b: Int): Int{
    return a + b
}

fun printMess(mess: String = "Default"){
    println(mess)
}

fun mul(a: Int, b: Int): Int = a * b

fun sumWithVararg(vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }

    return result
}