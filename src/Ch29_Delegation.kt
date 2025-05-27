interface Sound {
    fun makeSound()
}

class Dog: Sound {
    override fun makeSound() {
        println("Bark")
    }
}

class Cat: Sound {
    override fun makeSound() {
        println("Meow")
    }
}

//Past example, kind of
class Example {
    val lazyValue: String by lazy {
        println("computed")         //lazy block gets init and not the var
        "hello"
    }
}

//So whatever we get as the argument, we'll be implementing that override function
class PetShop(private val sound: Sound) : Sound by sound

fun main() {

    val dog = Dog()
    val cat = Cat()

    val petShopDog = PetShop(dog)
    val petShopCat = PetShop(cat)

    petShopDog.makeSound()
    petShopCat.makeSound()


}