
object MySingleton {

    var name: String = "Singleton"

    fun printName() {
        println(name)
    }
}

class MyClass3 {

    val age = 5

    companion object {
        var name: String = "Singleton MyClass3"

        fun printName() {
            println(name)
        }
    }
}

fun main() {

    println(MySingleton.name)  //No need to create an object
    MySingleton.printName()

    println(MyClass3.name)      // no need for an object cuz it is inside the companion/static
    // println(MyClass3.age)    //need to create an object cuz the age is outside the static field
    MyClass3.printName()

    val anonymous = object : MyInterface {
        override fun abstractMethod() {
            println("Testing object anonymous implementation")
        }

        override val property: String
            get() = "Test"

    }

    anonymous.abstractMethod()

}