//By default, classes are final(non inheritable)
//Make them inheritable with `open`
open class Vehicle(
    private var name: String,
    private var speed: Int,
) {

    open fun displayInfo() {
        println("Vehicle Name: ${this.name}")
        println("Vehicle Speed: ${this.speed}")
    }
}

//Extend by NewClass(*): BaseClass(*) {}
class Car(
    private var name: String,
    private var speed: Int,
    private var numOfDoors: Int,
): Vehicle(
    name,
    speed
) {
    //override with `override`
    override fun displayInfo() {
        super.displayInfo()
        println("Vehicle Doors: ${this.numOfDoors}")
    }
}


fun main() {

    val car = Car("Toyota", 200, 4)
    car.displayInfo()
}