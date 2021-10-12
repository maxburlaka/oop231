package oop

class Student(val firstName: String, val lastName: String, val group: String,val averageMark: Double){

   fun getScholarship(){

       if (this.averageMark == 5.0) {
           println("$firstName - 100")
       } else {
           println("$firstName - 80")
       }
   }

}
class Aspirant(val firstName: String, val lastName: String, val group: String,val averageMark: Double){

    @Override
    fun getScholarship(){

        if (this.averageMark == 5.0) {
            println("$firstName - 200")
        } else {
            println("$firstName - 180")
        }
    }

}


fun main() {

    val max = Student("Max", "Burlaka", "3-V", 4.4)
    val ann = Student("Ann", "Burla", "3-T", 5.0)
    val asp = Aspirant("Elon", "Musk", "3-A", 5.0)

    max.getScholarship()
    ann.getScholarship()
    asp.getScholarship()
}