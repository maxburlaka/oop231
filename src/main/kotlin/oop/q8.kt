package oop

class Animal() {
    val food = "Feed"
    val location = "Черкаси"
    val vt = Veterinarian(food, location)

    fun makeNoise() {

        println("Такое-то животное спит")
    }

    fun eat() {
        println("Такое-то животное ест")
    }

    fun sleep() {
        println("Такое-то животное спит")
    }

    class Dog() {
        fun name(){
           println("Dog goes to the vet")
        }

        @Override
        fun makeNoise() {
            println("Такое-то животное спит")
        }

        @Override
        fun eat() {
            println("Такое-то животное ест")
        }
    }

    class Cat() {
        fun name(){
           println("Cat goes to the vet")
        }

        @Override
        fun makeNoise() {
            println("Такое-то животное спит")
        }

        @Override
        fun eat() {
            println("Такое-то животное ест")
        }
    }

    class Horse() {
        fun name(){
            println("Horse goes to the vet")
        }

        @Override
        fun makeNoise() {
            println("Такое-то животное спит")
        }

        @Override
        fun eat() {
            println("Такое-то животное ест")
        }
    }
}

    class Veterinarian(val food: String, val location: String) {

        fun treatAnimal(Animal: Animal) {

            println(food)
            println(location)
        }
    }


fun main() {

    val dog = Animal.Dog()
    val cat = Animal.Cat()
    val horse = Animal.Horse()

        dog.name()
        cat.name()
        horse.name()
}