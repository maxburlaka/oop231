package oop

class Phone(var number: Int,var model: String, var weight: Int) {

    fun out(){
        println(number)
        println(model)
        println(weight)
        println()
    }
    fun receiveCall(){
        println(model)
        println("Звонит $number")
        println()
    }

}

fun main() {

    val f1 = Phone(380566273, "Xiaomi", 250)
    val f2 = Phone(380657464,"iPhone", 450)
    val f3 = Phone(380275748, "Huawei", 350)

    f1.out()
    f2.out()
    f3.out()

    f1.receiveCall()
    f2.receiveCall()
    f3.receiveCall()
}