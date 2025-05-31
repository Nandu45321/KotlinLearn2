import java.util.logging.Handler

typealias UserID = String
typealias StrMap = Map<String, String>

typealias Click = (Int) -> Unit

fun setclick(handler: Click) {
    handler(5)
}

fun main() {

    val usrID: UserID = "Hello"

    val stringMap: StrMap = mapOf("1" to "one")

    val set: Click = {
        println("Handling click")
    }
    setclick(set)

    setclick {
        println("Handling click 2")
    }




}