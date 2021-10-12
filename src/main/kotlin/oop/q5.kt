package oop

class AB(val A: Int, val B: Int){

    fun ab1(){
        if(A < B){

            for(i in A..B){
                println(i)
            }
        }
        else{
            for(i in A downTo B){
                println(i)
            }
        }
    }
}

fun main() {

    val go = AB(42, 30)
    go.ab1()

}