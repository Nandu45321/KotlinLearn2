import javax.sound.midi.MetaMessage

fun main() {

    try {
        val result = 10 / 0
    } catch (e: Exception){
        println("Exception is ${e.message}")
    }

    try {
        val data = "123a"
        val number = data.toInt()
        println(data)
    } catch (e: NumberFormatException) {
        println("Excptin: ${e}")
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("This message will always be executed")
    }

    class InvalidInputException(message: String) : Exception(message)


}

