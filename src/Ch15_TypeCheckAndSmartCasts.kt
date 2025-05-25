fun main() {

    println(typeChecker("Hi"))
    println(typeChecker(49))    
    println(typeChecker(48.9))

}

fun typeChecker(obj: Any): String {
    when(obj){
        is String -> return "String of length ${obj.length}"
        is Int -> return "Integer"
    }
    return "We do not know"
}