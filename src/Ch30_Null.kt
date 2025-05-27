fun main() {

    var nullableString: String? = "Hello"

    // gives `null` if string is null
    val length = nullableString?.length
    println(length)

    // Gives some default value of String is null
    val length3 = nullableString?.length ?: 0 // Default is 0
    println(length3)                          // ?: is called Elvis Operator

    if (nullableString != null) {
        val length2 = nullableString!!.length // Cancels the null. Use only if you are sure
    }

    val obj: Any = "Hello"
    val stringlength = obj as? String  // For type casting


}