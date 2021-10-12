package oop

class Person(val fullName : String, val age : Int){

    fun talk(){
        println("Такой-то  $fullName говорит")
    }
    fun move(){
        println("Такой-то  $fullName идет")
    }



}

fun main() {

    val p1 = Person("Max", 20)
    val p2 = Person("Andrei", 23)
    val p3 = Person("Misha", 22)

    p1.talk()
    p2.talk()
    p3.talk()

    println()

    p1.move()
    p2.move()
    p3.move()
}