
interface MyInterface {

    fun abstractMethod()

    fun concreteMethod() {
        println("This is a concrete method")
    }

    val property: String   //Cannot initialize properties
    val propertyWithDefault: String
        get() = "Default"   //If we want to set a default value, use  `get() = `

}




interface MyInterface2 {

    fun concreteMethod() {
        println("This is a concrete method")
    }

}

class MyClass : MyInterface {
    override fun abstractMethod() {
        println("Abstract method implementation")
    }

    override val property: String = "Property Value"

}
class MyClass2 : MyInterface, MyInterface2 {
    override fun abstractMethod() {
        println("Abstract method implementation")
    }
    //As this function is in both the classes, we need to specify from which class the function is being inherited
    override fun concreteMethod() {
        super<MyInterface>.concreteMethod()
    }

    override val property: String = "Property Value"

}


fun main() {

    val obj = MyClass()
    obj.abstractMethod()
    obj.concreteMethod()
    println(obj.property)
    println(obj.propertyWithDefault)

}