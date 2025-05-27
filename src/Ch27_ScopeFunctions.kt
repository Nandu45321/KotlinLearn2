import java.io.File


fun main() {
    // let
    val user: User? = User("Test", 1)

    user?.name
    user?.age  //Instead of this, we can use `let`

    val user1 = user?.let {  // Gets through only if the user is not Null
        println(it.name)  // it = user
        println(it.age)
        it    // the last line is returned
    }

    // run
    val sb = StringBuilder()
    sb.append("Hello")
    sb.append("World!")
    val str = sb.toString()

    val str2 = sb.run {
        append("Hello")  // or `this.append()`
        append("World!")
        toString()       // the last line is returned
    }
    println(str)
    println(str2)

    // with
    val user2 = User("Test2", 2)
    val str3 = with(user2) {
        "Name: $name, Age: $age"
    }
    println(str3)

    class User5{
        var name: String? = null
        var age: Int? = null

        override fun toString(): String {
            return "Name: $name, Age: $age"
        }
    }


    // apply
    val user5 = User5().apply {

        name = "Coding"   // or `this.name = "Coding"`
        age = 5
    }
    println(user5)

    //also
    val file = File("example.txt").also {
        println("file ${it.name} is being created")
        it.createNewFile()
    }



}