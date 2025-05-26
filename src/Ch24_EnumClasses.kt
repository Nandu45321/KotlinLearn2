
enum class Direction(private val degrees: Int) {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    fun description(): String {
        return "Direction is $name and degrees are $degrees"
    }

}

fun main() {

    val direction = Direction.EAST
    println(direction.description())

    println(direction.name)
    println(direction.ordinal)

    for (dir in Direction.entries) {
        println(dir)
    }
    
}