// Any -> Parent of all types | Used to represent any type of value
// Nothing -> Child/Subtype of all types | Used to represent a value that doesn't exist

fun main() {

    val obj : Any = "Hello"

    val str1: String? = obj as? String
    val str2: String = obj as String

    val result = try {
        fail("Any error")
    } catch (e: IllegalArgumentException) {
        println(e.stackTrace)
    }

}

fun fail(message: String): Nothing {              //Use when smth is expected to fail
    throw IllegalArgumentException(message)
}