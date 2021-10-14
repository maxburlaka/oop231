package oop

abstract class Shape(){

    open fun draw(){
        var color = "Green"
        println("Фігура намальована колір $color")
    }

}
class Circle(): Shape(){

    val a = 112
    val b = 170
    val c = 110
    override fun draw() {
        var color = "Green"
        println("Фігура намальована колір $color")
    }
}
class Rectangle(): Shape(){

    val a = 110
    val b = 130
    val c = 142

    override fun draw() {
        var color = "Green"
        println("Фігура намальована колір $color")
    }
}

fun main(){

    val ci = Circle()
    ci.draw()

    val re = Rectangle()
    re.draw()
}