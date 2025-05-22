fun main() {

    val name: String = "Nandu"

    val multiLine: String = """
        Coding
        Ambitions
    """.trimIndent()

    val escapeString = "This is an \"escape\" string"

    println(escapeString)
    println(multiLine)

    println("Their name's length is ${name.length}")

    println(multiLine.contains("coding", ignoreCase = true))

    println(name.replace("N", "V"))

    val sb = StringBuilder("Hello")
    sb.append("World", "Hi", "Kotlin")
    sb.insert(0, "Hi ")
    println(sb)

    val sbuffer = StringBuffer("Hello")
    sbuffer.append("World", "Hi", "Kotlin")
    sbuffer.insert(0, "Hi ")
    println(sbuffer)
    

}