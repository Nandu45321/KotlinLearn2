
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x = x + other.x, y = y + other.y)
    }
}


// Basically operator overloading
fun main() {

    val point1 = Point(1, 5)
    val point2 = Point(2, 7)

    val point3 = point1 + point2
    println(point3)

}