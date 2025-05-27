
class LazyVsLateInit {
    lateinit var userLateInit: User

    val userLazy: User by lazy {
        User("Coding", 4)
    }


}

fun main() {

    val obj = LazyVsLateInit()
    obj.userLateInit = User("Name", 1)

    println(obj.userLazy)

}