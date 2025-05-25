class Person {

    var name: String = ""
    private var age: Int = 0

    fun printInfo(){
        println("Name: $name, Age: $age")
    }

}

// Primary Constructor (Only one)
class Person2 (
    val name: String = "",
    val age: Int = 0
) {

    init {   // Will be called immediately when the class is called/object is created
        println("Person is created with name = $name and age = $age")
    }

    fun printInfo(){
        println("Name: $name, Age: $age")
    }

}

//Second Constructor (many can be present)
class Person3 (
    private var name: String = "",
    private var age: Int = 0
) {

    init {
        println("Person is created with name = $name and age = $age")
    }

    constructor(
        name: String  // If we want to define some default values for something
    ): this() {       // this() extends the primary constructor

    }

    constructor(
        person2: Person2
    ): this() {
        this.age = person2.age
        this.name = person2.name
    }

    fun printInfo(){
        println("Name: $name, Age: $age")
    }

}

fun main(){

    val person1 = Person()
    person1.name = "User1"

    val person2 = Person2("User0", 18)

    val person3 = Person3("User3", 18)
    val person4 = Person3(person2)

    person1.printInfo()
    person2.printInfo()
    person3.printInfo()
    person4.printInfo()

}