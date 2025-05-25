
class Person4 {

    var name: String = "John"
        get() = field.uppercase()     // Custom Getter
    //OR
    var name2: String = "Snow"
        get() {
            return field.uppercase()
        }

    var name3: String = "Nandu"
        get() = field.uppercase()
        set(value) {                   // Custom Setter
            field = value
        }

    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            } else {
                throw IllegalArgumentException("Age cannot be less than 0")
            }
        }

}

fun main() {

    val person = Person4()
    person.age = 25
    println(person.age)

    // person.age = 0

    person.name = "john" // Setter method will be called
    println(person.name) // Getter method will be called

}