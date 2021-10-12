package oop

class Car(){

    val dr = Driver()
    val en = Engine()

    fun cars() {
        println("BMW")
        println("S - class")
        println("1000kg")
        println(dr.driver())
    }
    fun start(){
        println("Поехали")
    }
    fun stop(){
        println("Останавливаемся")
    }
    fun turnRight(){
        println("Поворот направо")
    }
    fun turnLeft(){
        println("Поворот налево")
    }

    fun toStrings(){

        en.engine()
        dr.driver()
    }
}
class Engine(){

    fun engine(){
        println("234 ls")
        println("BMW")
    }
}

class Driver(){

    fun driver() {
        println("Burlaka M.V")
        println("5 years")
    }
}

class SportCar(){
    val sp = Car()

    fun SP(){
        sp.cars()
        println("300 km/h")
    }

}
class  Lorry(){
    val lr = Car()

    fun lorry(){
        lr.cars()
        println("2000 Kg")
    }
}


 fun main() {

}