// for higher order functions, use this, it's performant
inline fun calculate(operation: () -> Unit) {
    return operation()
}

inline fun execute(block: () -> Unit) { // to not have `return`, use `... crossline block: () ....
    println("Before Block")
    block() // if there is a return function in this fun, then it will directly return
    println("After Block") // In other words, the code of the fun will be directly copied and put there
}

fun main() {

    val result = calculate {
        10 + 20
    }

    execute {
        println("inside block")
        return
    }

}