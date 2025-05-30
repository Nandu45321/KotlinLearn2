// Basically Word Overloading

infix fun Point.moveBy(offset: Int): Point {
    return Point(this.x + offset, y = this.y + offset)
}


fun main() {

    val pair = 1 to "one"  // fun's like this
    println(pair)

    val point1 = Point(3, 5)
    println(point1 moveBy 3)

}