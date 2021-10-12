package oop

class Cargo(){

    val name = "Guitars"
    val Price = 10000
    val Rating = "5 / 10"
}
class Category(){

    val name = "Guitars"

    fun cargos() {
        val musicalInstruments: Array<String> = arrayOf("Yamaha","Parksons","Fender","Majesty")

        for(i in 0..3){
            println("${musicalInstruments[i]} ")
        }
    }
}
class Basket(){
    val soldOut: Array<String> = arrayOf("Yamaha","Fender")

    fun so() {
        for (i in 0..1) {
            println("${soldOut[i]}")

        }
    }
}
class User(val login: String, val password: String){

    fun print(){
        println(login)
        println(password)
    }
}
fun main() {

    val cg = Category()
    cg.cargos()

    println()

    val bk = Basket()
    bk.so()

    println()

    val us = User("qwerty","1234")
    us.print()
}